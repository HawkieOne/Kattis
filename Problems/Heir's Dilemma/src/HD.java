import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HD {
    public static void main(String[] args) {
        new HD();
    }

    public HD() {
        try (Scanner scanner = new Scanner(System.in)) {
            int lowerLimit = Integer.parseInt(scanner.next());
            int upperLimit = Integer.parseInt(scanner.next());
            int amount = 0;
            for (int i = lowerLimit; i <= upperLimit; i++) {
                boolean sameNumbers = false, undividable = false;
                int[] numbers;
                numbers = getSepareteNumbers(i);
                boolean noZeros = true;
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == 0) {
                        noZeros = false;
                    }
                }
                if (noZeros) {
                    for (int j = 0; j < numbers.length; j++) {
                        for (int k = i + 1; k < numbers.length; k++) {
                            if (numbers[j] == numbers[k]) {
                                sameNumbers = true;
                            }
                        }
                        if (i % numbers[j] != 0) {
                            undividable = true;
                        }
                    }
                }
                if (!sameNumbers && !undividable && noZeros) {
                    amount++;
                }
            }
            System.out.println(amount);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }

    public int[] getSepareteNumbers(int number) {
        int[] numbers = new int[6];
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (number > 0) {
            stack.push(number % 10);
            number = number / 10;
        }
        for (int i = 0; i < 6; i++) {
            numbers[i] = stack.pop();
        }
        return numbers;
    }
}
