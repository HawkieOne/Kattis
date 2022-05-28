import java.util.Scanner;

public class Mic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if(line.contains("ss")) {
            System.out.println("hiss");
        }
        else {
            System.out.println("no hiss");
        }
    }
}
