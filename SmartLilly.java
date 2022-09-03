import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int birthDayBonus = 10;
        int evenCounter = 0;
        double bdMoney = 0;
        int toyCount = 0;
        int brotherTake = 0;

        for (int i = 1; i <= age; i++) {

            if (i!= 1 && i % 2 == 0){
                evenCounter++;
                brotherTake++;
                bdMoney += birthDayBonus * evenCounter;
            }else{
                toyCount++;
            }
        }
        double total = (toyCount * toyPrice + bdMoney) - brotherTake;

        if (total >= washerPrice){
            System.out.printf("Yes! %.2f",total - washerPrice);
        }else{
            System.out.printf("No! %.2f",washerPrice - total);
        }
    }
}
