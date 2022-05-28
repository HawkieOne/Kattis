import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        int i = 0;
        String line;
        while( i < cases) {
            line = scanner.nextLine();
            String[] rec = line.split(" ");
            if(Integer.parseInt(rec[0]) < Integer.parseInt(rec[1]) - Integer.parseInt(rec[2])) {
                System.out.println("advertise");
            }
            else if(Integer.parseInt(rec[0]) == Integer.parseInt(rec[1]) - Integer.parseInt(rec[2])){
                System.out.println("does not matter");
            }
            else {
                System.out.println("do not advertise");
            }
            i++;
        }
    }
}
