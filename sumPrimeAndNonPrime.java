import java.util.Scanner;

public class sumPrimeAndNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isStop = false;
        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean isPrime = true;
        boolean notPrime = false;

        while (!isStop) {

            String input = scanner.nextLine();
            if (input.equals("stop")) {
                isStop = true;
                continue;
            }
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative");
                continue;
            }
            if (num == 0 || num == 1) {
                nonPrimeSum += num;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        nonPrimeSum += num;
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeSum += num;
                }
                isPrime = true;

            }

        }
        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
