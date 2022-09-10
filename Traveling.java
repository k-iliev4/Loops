import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int savings = 0;
        while (true) {
            String destination = scanner.nextLine();
            if (destination.equals("End")) {
                break;
            }
            int enough = Integer.parseInt(scanner.nextLine());

            while (savings <= enough) {
                int input = Integer.parseInt(scanner.nextLine());
                savings += input;
            }
            if (savings >= enough) {
                System.out.printf("Going to %s!\n",destination);
                savings = 0;
            }

        }
    }
}
