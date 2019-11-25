import org.sat4j.core.VecInt;
import org.sat4j.pb.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.*;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        Reader reader = new DimacsReader(solver);
        PrintWriter out = new PrintWriter(System.out,true);

        // CNF filename is given on the command line (their comment)
        String filePath = "src/main/resources/ecos_x86.dimacs";

        try {
            IProblem problem = reader.parseInstance(filePath);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !");
                reader.decode(problem.model(),out);
                //System.out.println("Number of dead features: " + getDeadFeatures(problem, filePath));
                Map<Integer,String> features = getFeatures(problem,filePath);
                System.out.println("Number of features: " + features.size());

                Map<Integer,String> deadFeatures = getDeadFeatures(problem, features);
                System.out.println("Number of dead features: " + deadFeatures.size());
                for (Integer key:deadFeatures.keySet()) {
                    System.out.println(key + ": " + deadFeatures.get(key));
                }

                //TODO Create a method that returns the number of implications and dumps them all in a file

            } else {
                System.out.println("Unsatisfiable !");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
        } catch (ParseFormatException e) {
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        } catch (ContradictionException e) {
            System.out.println("Unsatisfiable (trivial)!");
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");
        }

    }

    //TODO improve this method. Works correctly, but is very inefficient
    private static Map<Integer,String> getFeatures(IProblem problem, String filepath){

        Map<Integer,String> map = new HashMap<>();

        try {
            FileReader fr = new FileReader(filepath);

            BufferedReader br = new BufferedReader(fr);

            while(true){
                String row = br.readLine();
                if(row.charAt(0) != 'c') break;
                row = row.substring(2);
                int space = row.indexOf(" ");
                Integer number = Integer.valueOf(row.substring(0,space));
                String name = row.substring(space+1);

                map.put(number,name);
            }

        }catch (FileNotFoundException e) {
           return null;
        } catch (IOException e) {
            return null;
        }
        return map;
    }

    //TODO Create method that returns a map of dead features
    private static Map<Integer,String> getDeadFeatures(IProblem problem,Map<Integer,String> features)
            throws TimeoutException {

        Map<Integer,String> deadFeautures = new HashMap<>();

        for (Integer key: features.keySet()) {

            IVecInt value = new VecInt();
            value.insertFirst(key);

            if(!problem.isSatisfiable(value)){
                deadFeautures.put(key,features.get(key));
            }
        }

        return deadFeautures;
    }

}
