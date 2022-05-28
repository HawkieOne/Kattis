import java.util.ArrayList;
import java.util.Scanner;

public class FF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int events = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> daysWithFood = new ArrayList<>();
        for(int i = 0; i < events; i++){
            int firstDay = Integer.parseInt(scanner.next());
            int lastDay = Integer.parseInt(scanner.next());
            for(int j = firstDay; j <= lastDay; j++){
                if(!daysWithFood.contains(j)){
                    daysWithFood.add(j);
                }
            }
        }
        System.out.println(daysWithFood.size());
    }
}
