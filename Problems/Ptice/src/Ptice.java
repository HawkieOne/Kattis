import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int questions = Integer.parseInt(scanner.nextLine());
            char[] adrian = new char[questions];
            char[] bruno = new char[questions];
            char[] goran = new char[questions];
            char[] test = new char[questions];
            String word = scanner.next();
            for (int i = 0; i < questions; i++) {
                test[i] = word.charAt(i);
                if (i % 3 == 0) {
                    adrian[i] = 'A';
                } else if (i % 3 == 1) {
                    adrian[i] = 'B';
                } else {
                    adrian[i] = 'C';
                }

                if (i % 6 == 0) {
                    goran[i] = 'C';
                } else if (i % 6 == 1) {
                    goran[i] = 'C';
                } else if (i % 6 == 2) {
                    goran[i] = 'A';
                } else if (i % 6 == 3) {
                    goran[i] = 'A';
                } else if (i % 6 == 4) {
                    goran[i] = 'B';
                } else {
                    goran[i] = 'B';
                }

                if (i % 4 == 0 || i % 4 == 2) {
                    bruno[i] = 'B';
                } else if (i % 4 == 1) {
                    bruno[i] = 'A';
                } else {
                    bruno[i] = 'C';
                }
                // System.out.println("Test: " + Arrays.toString(test));
                // System.out.println("Adrian: " + Arrays.toString(adrian));
                // System.out.println("Goran: " + Arrays.toString(goran));
                // System.out.println("Bruno: " + Arrays.toString(bruno));
            }
            int brunoCount = 0, adrianCount = 0, goranCount = 0, highest = 0;
            for (int i = 0; i < questions; i++) {
                if (test[i] == bruno[i]) {
                    brunoCount++;
                }
                if (test[i] == goran[i]) {
                    goranCount++;
                }
                if (test[i] == adrian[i]) {
                    adrianCount++;
                }

                if (brunoCount >= highest) {
                    highest = brunoCount;
                }
                if (adrianCount >= highest) {
                    highest = adrianCount;
                }
                if (goranCount >= highest) {
                    highest = goranCount;
                }
            }

            System.out.println(highest);
            if (adrianCount == highest) {
                System.out.println("Adrian");
            }
            if (brunoCount == highest) {
                System.out.println("Bruno");
            }
            if (goranCount == highest) {
                System.out.println("Goran");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
