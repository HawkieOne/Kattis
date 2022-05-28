import java.util.Scanner;

public class FSOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for(int i = 0; i < cases; i++){
            String word = scanner.nextLine();
            word = word.toLowerCase();
            if(word.contains("rose") || word.contains("pink")){
                count++;
            }
        }
        if(count == 0){
            System.out.println("I must watch Star Wars with my daughter\n");
        }
        else{
            System.out.println(count);
        }
    }
}
