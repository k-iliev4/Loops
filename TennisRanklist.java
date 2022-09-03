import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = startPoints;
        int averagePoints = 0;
        double wins = 0;
        int rawPoints = 0;

        for (int i = 0; i < tournamentCount; i++) {
            String stage = scanner.nextLine();

            if (stage.equals("W")){
                points += 2000;
                wins++;
                rawPoints+=2000;
            }else if (stage.equals("F")){
                points+=1200;
                rawPoints += 1200;
            }else if (stage.equals("SF")){
                points+=720;
                rawPoints += 720;
            }
        }
        averagePoints = points / tournamentCount;
        wins = wins/tournamentCount * 100;

        System.out.printf("Final points: %d\n",points);
        System.out.printf("Average points: %d\n",rawPoints / tournamentCount);
        System.out.printf("%.2f%%\n",wins);
    }
}
