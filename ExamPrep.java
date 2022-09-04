import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        int badGradeCounter = 0;
        int gradesCount = 0;
        double average = 0;
        String lastProblem = null;

        while(true){
            String subject = scanner.nextLine();
            if (subject.equals("Enough")){
                break;
            }
            if (!subject.equals("Enough")){
                lastProblem = subject;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            gradesCount++;
            average+=grade;

            if (grade<= 4){
                badGradeCounter++;
            }
            if (badGradeCounter == badGrades){
                System.out.printf("You need a break, %d poor grades.",badGradeCounter);
                break;
            }
        }
        if (badGradeCounter < badGrades){
            System.out.printf("Average score: %.2f\n", average / gradesCount);
            System.out.println("Number of problems: "+ gradesCount);
            System.out.println("Last problem: "+lastProblem);

        }
    }
}
