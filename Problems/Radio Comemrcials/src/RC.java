import java.util.Scanner;

public class RC {

    public int findMaxSumSubSequence(int[] arr)

    {
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (maxEndingHere < 0){
                maxEndingHere = arr[i];
            }else
                maxEndingHere += arr[i];

            if (maxEndingHere >= maxSoFar){
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Make an object of Kadane class */
        RC sumObject = new RC();
        int N = scan.nextInt(); // get N commercial breaks
        int P = scan.nextInt(); // get P price of one commercial break
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = (scan.nextInt()- P);
        }

        int sum = sumObject.findMaxSumSubSequence(arr);
        System.out.println(sum);
    }
}
