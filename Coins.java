import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //0.01 ; 0.02 ; 0.05 ; 0,1 ; 0,2 ; 0.5 ; 1 ; 2

        double input = Double.parseDouble(scanner.nextLine());
        double coins = input * 100;
        double sum = 0;
        int coinCounter = 0;

        while (coins >= sum) {

            if (coins >= 200) {
                coins -= 200;
                coinCounter++;
                sum += 200;
            }
            if (coins>= 100) {
                coins -= 100;
                coinCounter++;
                sum += 100;
            }
            if (coins >= 50) {
                coins -= 50;
                coinCounter++;
                sum += 50;
            }
            if (coins >= 20) {
                coins -= 20;
                coinCounter++;
                sum += 20;
            }
            if (coins >= 10) {
                coins -= 10;
                coinCounter++;
                sum += 10;
            }
            if (coins >= 5) {
                coins -= 5;
                coinCounter++;
                sum += 5;
            }
            if (coins >= 2) {
                coins -= 2;
                coinCounter++;
                sum += 2;
            }
            if (coins >= 1) {
                coins -= 1;
                coinCounter++;
                sum += 1;
            }else{
                break;
            }
        }
        System.out.println(coinCounter);
    }
}
