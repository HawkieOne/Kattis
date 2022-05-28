import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Integer> doubles = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int modulo = Integer.parseInt(scanner.nextLine()) % 42;
            results.add(modulo);
        }
        for(int number: results){
            for(int number2: results){
                if(number == number2){
                    if(!doubles.contains(number)){
                        doubles.add((number));
                    }
                }
            }
        }
        System.out.println(doubles.size());
    }
}
