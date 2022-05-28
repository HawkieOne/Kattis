import java.util.Scanner;

public class OCPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.next());
        int chickens = Integer.parseInt(scanner.next());
        if(guests <= chickens){
            int leftovers = chickens - guests;
            if(leftovers == 1){
                System.out.println("Dr. Chaz will have " + leftovers +  " piece of chicken left over!\n");
            }
            else {
                System.out.println("Dr. Chaz will have " + leftovers +  " pieces of chicken left over!\n");
            }
        }
        else{
            int leftToBuy = guests - chickens;
            if (leftToBuy == 1){
                System.out.println("Dr. Chaz needs " + leftToBuy + " more piece of chicken!\n");
            }
            else{
                System.out.println("Dr. Chaz needs " + leftToBuy + " more pieces of chicken!\n");
            }
        }
    }
}
