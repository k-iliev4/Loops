import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double studentCount = 0;
        double standardCount = 0;
        double kidCount = 0;
        int ticketCounter = 0;
        String input = "";

        while (true) {
            if (input.equals("Finish")){
                break;
            }
            String name = scanner.nextLine();
            if (name.equals("Finish")) {
                break;
            }
            int freeSeatsCount = Integer.parseInt(scanner.nextLine());
            double movieTicketCounter = 0;
            input = scanner.nextLine();
            while (!input.equals("End") && !input.equals("Finish")) {
                ticketCounter++;
                movieTicketCounter++;
                if (input.equals("standard")) {
                    standardCount++;
                }
                if (input.equals("student")) {
                    studentCount++;
                }
                if (input.equals("kid")) {
                    kidCount++;
                }
                input = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%%", name, (movieTicketCounter / freeSeatsCount) * 100.0);
            movieTicketCounter = 0;
        }
        System.out.println("Total tickets: " + ticketCounter);
        System.out.printf("%.2f%% student tickets\n",studentCount / ticketCounter * 100.00);
        System.out.printf("%.2f%% standard tickets\n",standardCount / ticketCounter * 100.00);
        System.out.printf("%.2f%% kid tickets\n",kidCount / ticketCounter * 100.00);
    }
}
