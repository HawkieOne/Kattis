import java.util.HashMap;
import java.util.Scanner;

public class ACMCS {
    public static final int NUM = 31;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        int points = 0, count = 0;
        String task = "", state = "";
        int minutes = Integer.parseInt(scanner.next());
        if(minutes != -1){
            task = scanner.next();
            state = scanner.next();
            hashMap.put(task, 0);

            if(state.equals("right")){
                points += minutes;
                count++;
            }
        }


        while(minutes != -1){
            minutes = Integer.parseInt(scanner.next());
            if(minutes == -1){
                break;
            }
            task = scanner.next();
            state = scanner.next();
            if(hashMap.containsKey(task)){
                hashMap.put(task, hashMap.get(task) + 1);
            }
            else{
                hashMap.put(task, 0);
            }

            if(state.equals("right")){
                points += minutes + hashMap.get(task) * 20;
                count++;
            }
        }
        System.out.println(count + " " + points);
    }
}
