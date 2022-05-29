import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amountOfnumbers = Integer.parseInt(scanner.nextLine());
            boolean fail = false;

            int firstNumber = Integer.parseInt(scanner.nextLine());
            if (firstNumber != 1) {
                int i = 1;
                while (i != firstNumber) {
                    System.out.println(i);
                    i++;
                }
            }
            for (int i = 1; i < amountOfnumbers; i++) {
                int nextNumber = Integer.parseInt(scanner.nextLine());
                if (firstNumber + 1 != nextNumber) {
                    for (int j = firstNumber + 1; j < nextNumber; j++) {
                        System.out.println(j);
                        fail = true;
                    }
                }
                firstNumber = nextNumber;
            }
            if (fail == false) {
                System.out.println("good job");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
