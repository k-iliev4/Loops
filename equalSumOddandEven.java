import java.util.Scanner;

public class equalSumOddandEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddsum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddsum += currentDigit;
                }


            }
            if (oddsum == evenSum){
                System.out.print(i + " ");
            }

        }


    }
}
