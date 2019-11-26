import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.pb.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
                System.out.println("Number of implications: " + getNbrOfImplicationsAndCreateFile(problem, features,filePath));

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

        Map<Integer,String> deadFeatures = new HashMap<>();

        for (Integer key: features.keySet()) {

            IVecInt value = new VecInt();
            value.insertFirst(key);

            if(!problem.isSatisfiable(value)){
                deadFeatures.put(key,features.get(key));
            }
        }

        return deadFeatures;
    }

    private static int getNbrOfImplicationsAndCreateFile(IProblem problem, Map<Integer,String> features, String filepath)
            throws TimeoutException {

        List<String> implications = new ArrayList<>();
        int amount = 0;
        List<String> rows = new ArrayList<>();

        try {
            rows = Files.readAllLines(Paths.get(filepath), StandardCharsets.UTF_8);
            rows.removeIf(n -> n.charAt(0) == 'c');
        }catch (FileNotFoundException e) {
            return -1;
        } catch (IOException e) {
            return -1;
        }


        //Checks if A implies B ((not A) or B)
        for (Integer A: features.keySet()) {
            for (Integer B: features.keySet()) {

                if(!A.equals(B)) {

                    /*IVecInt value = new VecInt();

                    value.insertFirst(B);
                    value.insertFirst(-A);

                    if (!problem.isSatisfiable(value)) {
                        System.out.println(value.toString());
                        amount++;
                    }*/

                    String targetOne = -A + " " + B + " " + 0;
                    String targetTwo = B + " " + -A + " " + 0;

                    for (String row: rows) {

                        if (row.equals(targetOne) || row.equals(targetTwo)) {
                            implications.add(features.get(A) + " -> " + features.get(B));
                            amount++;
                        }

                    }

                }
            }
        }

        return amount;
    }

}
