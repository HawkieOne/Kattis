import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.next();
            int initialCount = word.charAt(0);
            int letterAdded = 0, count = 0;
            for (int i = 0; i < word.length(); i++) {
                int charToInt = word.charAt(i);
                System.out.println(charToInt + " " + initialCount + " " + count);
                while (charToInt != initialCount + count) {
                    letterAdded++;
                    count++;
                }
                initialCount += count;
                count = 0;
                System.out.println(initialCount);
            }
            System.out.println(letterAdded);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
