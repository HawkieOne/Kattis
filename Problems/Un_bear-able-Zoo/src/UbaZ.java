import com.sun.source.tree.Tree;

import java.util.*;

public class UbaZ {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.nextLine());
            int count = 1;
            while (cases != 0) {
                System.out.println("List " + count + ":");
                TreeMap<String, Integer> animals = new TreeMap<>();
                for (int i = 0; i < cases; i++) {
                    String line = scanner.nextLine();
                    String[] words = line.split(" ");
                    String animalName = words[words.length - 1];
                    animalName = animalName.toLowerCase();
                    if (!animals.containsKey(animalName)) {
                        animals.put(animalName, 1);
                    } else {
                        int number = animals.get(animalName);
                        animals.replace(animalName, animals.get(animalName) + 1);
                    }
                }

                Iterator it = animals.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    System.out.println(pair.getKey() + " | " + pair.getValue());
                }

                cases = Integer.parseInt(scanner.nextLine());
                count++;
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
