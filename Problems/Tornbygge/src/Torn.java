import java.util.Scanner;

public class Torn {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int parts = Integer.parseInt(scanner.nextLine());
            int nrOfTowers = 0;

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            Integer[] numbersInt = new Integer[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numbersInt[i] = Integer.parseInt(numbers[i]);
            }

            int partOne = numbersInt[0];
            nrOfTowers++;

            for (int i = 1; i < numbersInt.length; i++) {
                int partTwo = numbersInt[i];
                if (partTwo > partOne) {
                    nrOfTowers++;
                }
                partOne = partTwo;
            }
            System.out.println(nrOfTowers);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
