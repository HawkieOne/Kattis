import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            int amountOfStudents = Integer.parseInt(scanner.next());
            int sum = 0;
            ArrayList<Integer> grades = new ArrayList<>();
            for(int j = 0; j < amountOfStudents; j++){
                int grade = Integer.parseInt(scanner.next());
                grades.add(grade);
                sum += grade;
            }
            double amountOfStudentsDouble = amountOfStudents * 1.0;
            double average = sum / amountOfStudentsDouble;
            double aboveAverage = 0;
            for(int j = 0; j < grades.size(); j++){
                if(grades.get(j) > average){
                    aboveAverage++;
                }
            }
            double percentage = ((double)aboveAverage / amountOfStudents) * 100;
//            percentage = (double)Math.round(percentage * 1000d) / 1000d;
            DecimalFormat df = new DecimalFormat("#.000");
            System.out.println(String.format("%.3f", percentage) + "%");
        }
    }
}
