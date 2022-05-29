import java.util.Scanner;

public class RC {

    public int findMaxSumSubSequence(int[] arr) {
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxEndingHere < 0) {
                maxEndingHere = arr[i];
            } else
                maxEndingHere += arr[i];

            if (maxEndingHere >= maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            RC sumObject = new RC();
            int N = scan.nextInt();
            int P = scan.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = (scan.nextInt() - P);
            }

            int sum = sumObject.findMaxSumSubSequence(arr);
            System.out.println(sum);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
