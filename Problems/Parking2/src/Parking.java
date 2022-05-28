import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int costA = Integer.parseInt(scanner.next());
        int costB = Integer.parseInt(scanner.next());
        int costC = Integer.parseInt(scanner.next());
        int cost = 0;
        int[][] cars = new int[2][3];
        for(int i = 0; i < 3; i++){
            cars[0][i] = Integer.parseInt(scanner.next());
            cars[1][i] = Integer.parseInt(scanner.next());
        }
        int highest = 0;
        for(int i = 0; i < 3; i++){
            if(cars[1][i] > highest){
                highest = cars[1][i];
            }
        }

        int count = 0;
        for(int i = cars[0][0]; i < highest; i++){
            if(i >= cars[0][0] && i < cars[1][0]){
                count++;
            }
            if(i >=  cars[0][1] && i < cars[1][1]){
                count++;
            }
            if(i >= cars[0][2] && i < cars[1][2]){
                count++;
            }
            if(count == 1){
                cost += costA;
            }
            else if(count == 2){
                cost += costB * 2;
            }
            else if(count == 3){
                cost += costC * 3;
            }
            count = 0;
        }
        System.out.println(cost);
    }
}
