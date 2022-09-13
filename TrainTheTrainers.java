import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double avereageScorePerPerson = 0;
        double totalScore = 0;
        int presentationCount = 0;
        while (true) {
            presentationCount++;
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                avereageScorePerPerson += grade;

            }
            avereageScorePerPerson = avereageScorePerPerson / jury;
            totalScore += avereageScorePerPerson;
            System.out.println(presentationName+ " - "+ avereageScorePerPerson);
            avereageScorePerPerson = 0;
            presentationName = scanner.nextLine();
            if (presentationName.equals("Finish")){
                break;
            }
        }
        System.out.printf("Student's final assessment is %.2f",totalScore / presentationCount);
    }
}
