import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int addends = Integer.parseInt(scanner.nextLine());
        int i = 0, sum = 0;
        while(i < addends) {
            String number = scanner.nextLine();
            String[] formatted = {number.substring(0, number.length() - 1), number.substring(number.length() - 1)};
            sum += Math.pow(Integer.parseInt(formatted[0]), Integer.parseInt(formatted[1]));
            i++;
        }
        System.out.println(sum);
    }
}
