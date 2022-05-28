import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int amoundofdays = 0, i = 1;
        while( i <= M - 1) {
            if(i <= 7) {
                if(i == 2) {
                    amoundofdays += 28;
                }
                else if( i % 2 == 1) {
                    amoundofdays += 31;
                }
                else {
                    amoundofdays += 30;
                }
            }
            else {
                if( i % 2 == 1) {
                    amoundofdays += 30;
                }
                else {
                    amoundofdays += 31;
                }
            }
            i++;
        }
        amoundofdays += D;
        amoundofdays = amoundofdays % 7;
        if(amoundofdays == 1) {
            System.out.println("Thursday");
        }
        else if (amoundofdays == 2) {
            System.out.println("Friday");
        }
        else if (amoundofdays == 3) {
            System.out.println("Saturday");
        }
        else if (amoundofdays == 4) {
            System.out.println("Sunday");
        }
        else if (amoundofdays == 5) {
            System.out.println("Monday");
        }
        else if (amoundofdays == 6) {
            System.out.println("Tuesday");
        }
        else if (amoundofdays == 7 | amoundofdays == 0) {
            System.out.println("Wednesday");
        }
    }
}
