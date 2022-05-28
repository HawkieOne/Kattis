import java.util.Scanner;

public class LB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sweetJars = Integer.parseInt(scanner.next());
        int sourJars = Integer.parseInt(scanner.next());
        while(sweetJars != 0 || sourJars != 0){
            if(sweetJars + sourJars == 13){
                System.out.println("Never speak again.");
            }
            else{
                if (sweetJars > sourJars){
                    System.out.println("To the convention.");
                }
                else if(sweetJars < sourJars){
                    System.out.println("Left beehind.");
                }
                else{
                    System.out.println("Undecided.");
                }
            }
            sweetJars = Integer.parseInt(scanner.next());
            sourJars = Integer.parseInt(scanner.next());
        }
    }
}
