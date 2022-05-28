import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bats = Integer.parseInt(scanner.nextLine());
        int i = 0, count = 0;
        double sum = 0;
        while(i < bats) {
            int type = Integer.parseInt(scanner.next());
            if(type != -1)
            {
                sum +=type;
            }
            else{
                count++;
            }
            i++;
        }
        bats = bats - count;
        System.out.println(sum / bats);
    }
}
