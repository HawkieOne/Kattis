import java.util.Scanner;

public class SKoP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            int caseNumber = Integer.parseInt(scanner.next());
            int N = Integer.parseInt(scanner.next());
            int s1 = 0, s2 = 0, s3 = 0, N1 = N, N2 = N, N3 = N;
            int j = 1;
            while (N1 > 0 || N2 > 0 || N3 > 0){
                if(N1 > 0){
                    s1 += j;
                    N1--;
                }
                if(N2 > 0 && j % 2 == 1){
                    s2 += j;
                    N2--;
                }
                if(N3 > 0 && j % 2 == 0){
                    s3 += j;
                    N3--;
                }
                j++;
            }
            System.out.println(caseNumber + " " + s1 + " " + s2 + " " + s3);
        }
    }
}
