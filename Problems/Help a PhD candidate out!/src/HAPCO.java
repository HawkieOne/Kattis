import java.util.Scanner;

public class HAPCO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            String equation = scanner.next();
            if(equation.charAt(0) != 'P'){
                String[] numbers;
                numbers = equation.split("\\+");
                int a = Integer.valueOf(numbers[0]), b = Integer.valueOf(numbers[1]);
                System.out.println(a + b);
            }
            else {
                System.out.println("skipped");
            }
        }
    }
}
