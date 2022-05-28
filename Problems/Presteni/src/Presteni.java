import java.util.Scanner;

public class Presteni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int circles = Integer.parseInt(scanner.nextLine());
        int firctCircleRadius = Integer.parseInt(scanner.next());
        for(int i = 1; i < circles; i++){
            int circlesFirst = 1, circlesSecond = 1;
            int circleRadius = Integer.parseInt(scanner.next());
            int circleRadius2 = circleRadius, firsCircleRadius2 = firctCircleRadius;
            while(firsCircleRadius2 != circleRadius2){
                if(firsCircleRadius2 < circleRadius2){
                    firsCircleRadius2 += firctCircleRadius;
                    circlesFirst++;
                }
                else {
                    circleRadius2 += circleRadius;
                    circlesSecond++;
                }
            }
            if(firsCircleRadius2 == circleRadius2){
                System.out.println(circlesSecond + "/" + circlesFirst);
            }
        }
    }
}
