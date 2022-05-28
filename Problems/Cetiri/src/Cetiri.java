import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cetiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        Collections.sort(numbers);
        int diff1 = numbers.get(1) - numbers.get(0);
        int diff2 = numbers.get(2) - numbers.get(1);
        if ( diff1 == diff2) {
            System.out.println(numbers.get(2) + diff1);
        } else if (diff1 < diff2) {
            System.out.println(numbers.get(2) - diff1);
        } else {
            System.out.println(numbers.get(0) + diff2);
        }
    }
}
