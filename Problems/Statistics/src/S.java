import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sample.in");
        if(file.exists()){
            Scanner scanner  = new Scanner(file);
            while(true){
                String line = scanner.nextLine();
                System.out.println(line);
                if(line == null){
                    return;
                }
                String[] numbers = line.split(" ");
                int cases = Integer.parseInt(numbers[0]);
                for(int i = 0; i < cases; i++){

                }
            }
        }
//        Scanner scanner = new Scanner(System.in);
    }
}
