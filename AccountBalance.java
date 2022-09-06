import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("NoMoreMoney")) {
                break;
            }
            double inp = Double.parseDouble(input);
            if (inp <= 0){
                System.out.println("Invalid operation!");
                break;
            }
            sum += inp;
            System.out.println("Increase: " + inp);
        }
        System.out.println("Total: " + sum);
    }
}
