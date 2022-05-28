import java.util.Scanner;

public class ADF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        try{
            while(true){
                line = scanner.nextLine();
                long x, y;
                if(line == null){
                    return;
                }
                else{
                    String[] temp = line.split(" ");
                    x = Long.parseLong(temp[0]);
                    y = Long.parseLong(temp[1]);
                }
                System.out.println(Math.abs(x - y));
            }
        }catch(Exception e){

        }
    }
}
