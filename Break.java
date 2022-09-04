import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double requiredMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendCounter = 0;
        int dayCounter = 0;


        while(availableMoney < requiredMoney){
            String action = scanner.nextLine();
            dayCounter++;
            double sum = Double.parseDouble(scanner.nextLine());
            if (action.equals("spend")){
                availableMoney-=sum;
                spendCounter++;
                if (sum > availableMoney){
                    availableMoney = 0;
                }
                if (spendCounter == 5){
                    System.out.println("You can't save the money.");
                    System.out.println(dayCounter);
                    break;
                }
            }
            if (action.equals("save")){
                spendCounter = 0;
                availableMoney+=sum;
            }

        }
        if (spendCounter < 5){
            System.out.printf("You saved the money for %d days",dayCounter);
        }
    }
}
