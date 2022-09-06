import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double gradeCount = 0.0;
        int currGrade = 0;
        double sum = 0;
        int failCount = 0;


        while(true){
            double grade = Double.parseDouble(scanner.nextLine());
            gradeCount++;
            currGrade++;
            sum+=grade;
            if (grade < 4){
                failCount++;
                if (failCount == 2){
                    break;
                }
            }
            if (gradeCount == 12){
                break;
            }

        }
        if (failCount == 2){
            System.out.printf("%s has been excluded at %d grade",name, currGrade);
        }
        if (gradeCount == 12){
            System.out.printf("%s graduated. Average grade: %.2f",name,sum / gradeCount);
        }
    }
}
