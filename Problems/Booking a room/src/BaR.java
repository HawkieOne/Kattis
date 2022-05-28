import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BaR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());
        scanner.nextLine();
        ArrayList<Integer> bookedRooms = new ArrayList<>();
        for(int i = 1; i <= r; i++){
            bookedRooms.add(i);
        }
        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            bookedRooms.remove(bookedRooms.indexOf(number));
        }
        if(r == n){
            System.out.println("too late");
        }
        else{
            System.out.println(bookedRooms.get(ThreadLocalRandom.current().nextInt(0, bookedRooms.size() + 1)));
        }
    }
}
