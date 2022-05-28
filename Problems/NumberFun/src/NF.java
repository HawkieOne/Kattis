import java.util.Scanner;

public class NF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            float term1 = Float.parseFloat(scanner.next());
            float term2 = Float.parseFloat(scanner.next());
            float result = Float.parseFloat(scanner.next());
            if(term1 + term2 == result || term1 - term2 == result || term1 * term2 == result || term1 / term2 == result ||
                term2 - term1 == result || term2 / term1 == result){
                System.out.println("Possible");
            }
            else{
                System.out.println("Impossible");
            }
        }
    }
}
