import java.util.Scanner;

public class TL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountProblems = Integer.parseInt(scanner.next());
        int amountCases = Integer.parseInt(scanner.next());
        int count = 0;
        for(int i = 0; i < amountProblems; i++){
            int wordCount = 0;
            for(int j = 0; j < amountCases; j++){
                String testCase = scanner.next();
                boolean upper = false;
                for(int k = 1; k < testCase.length(); k++){
                    if(!Character.isLowerCase(testCase.charAt(k))){
                        upper = true;
                    }
                }
                if(!upper){
                    wordCount++;
                }
                if(wordCount == amountCases){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
