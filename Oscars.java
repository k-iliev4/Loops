import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int votersCount = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;

        for (int i = 0; i < votersCount; i++) {
            String voterName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            double currentPoints = voterName.length() * points / 2;
            totalPoints += currentPoints;

            if (totalPoints >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.2f",actorName, totalPoints);
                break;
            }

        }
        if (totalPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.2f more!",actorName, 1250.5 - totalPoints);
        }
}
}
