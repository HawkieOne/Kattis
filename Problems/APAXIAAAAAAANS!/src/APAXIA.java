import java.util.Scanner;

public class APAXIA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] name = scanner.nextLine().toCharArray();
        String s = "";
        for(int i = 1; i < name.length; i++) {
            if(name[i] != name[i - 1]) {
                s = s + name[i - 1];
            }
            if(name[i-2] != name[i - 2] || s.equals("")) {
                s += name[i - 1];
            }
        }
        System.out.println(s);
    }
}
