import java.util.Scanner;

public class DD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while(i < cases) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(str1);
            System.out.println(str2);
            for(int j = 0; j < str1.length(); j++) {
                if(str1.charAt(j) == str2.charAt(j)) {
                    System.out.print(".");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
            System.out.println();
            i++;
        }
    }
}
