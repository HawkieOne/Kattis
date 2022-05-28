import java.util.Scanner;

public class SfR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bobAge = Integer.parseInt(scanner.next());
        int bobRetirement = Integer.parseInt(scanner.next());
        int bobMoneyPerYear = Integer.parseInt(scanner.next());
        int aliceAge = Integer.parseInt(scanner.next());
        int aliceMoneyPerYear = Integer.parseInt(scanner.next());
        int money = (bobRetirement - bobAge) * bobMoneyPerYear;
        int aliceMoney = 0;
        while(aliceMoney <= money){
            aliceMoney +=aliceMoneyPerYear;
            aliceAge++;
        }
        System.out.println(aliceAge);
    }
}
