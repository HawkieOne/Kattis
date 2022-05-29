import java.util.Scanner;

public class Mjehuric {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];
            numbers[0] = Integer.parseInt(scanner.next());
            numbers[1] = Integer.parseInt(scanner.next());
            numbers[2] = Integer.parseInt(scanner.next());
            numbers[3] = Integer.parseInt(scanner.next());
            numbers[4] = Integer.parseInt(scanner.next());

            while (numbers[0] > numbers[1] || numbers[1] > numbers[2] || numbers[2] > numbers[3]
                    || numbers[3] > numbers[4]) {
                for (int i = 0; i < 4; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        int temp = numbers[i + 1];
                        numbers[i + 1] = numbers[i];
                        numbers[i] = temp;
                        for (int j = 0; j < 5; j++) {
                            System.out.print(numbers[j] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
