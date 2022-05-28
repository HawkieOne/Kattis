import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            int stores = Integer.parseInt(scanner.nextLine());
            int parkingSpace1 = 0, parkingSpace2 = 0;
            for(int j = 0; j < stores; j++){
                int storeLocation = Integer.parseInt(scanner.next());
                parkingSpace1 = storeLocation;
                if(parkingSpace2 - parkingSpace1 < parkingSpace1){
                    parkingSpace2 = parkingSpace1;
                }
            }
        }
    }
}
