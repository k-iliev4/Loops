import java.util.Scanner;

public class OddOrEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n ; i++) {

            if (i%2==0 && i !=1){
                evenSum+=Integer.parseInt(scanner.nextLine());
            }else{
                oddSum+=Integer.parseInt(scanner.nextLine());
            }
        }
        if (oddSum == evenSum){
            System.out.println("Yes");
            System.out.println("Sum = "+ evenSum);
        }else{
            System.out.println("No");
            System.out.println("Diff = "+Math.abs(oddSum - evenSum));
        }
    }
}
