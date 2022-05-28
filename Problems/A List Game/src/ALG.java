import java.util.ArrayList;
import java.util.Scanner;

public class ALG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
//        int incrementer = number % 2 == 0 ? 1 : 2;
//        for(int i = 1; i <= Math.sqrt(number); i += incrementer){
//            if(number % i == 0){
//                list.add(i);
//                if(i != number / i){
//                    list.add(number / i);
//                }
//            }
//        }
        int count = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                count++;
            }
        }
        System.out.println(count);
    }
}
