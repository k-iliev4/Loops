import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int endOfInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;
        boolean found = false;
        int firstNum = 0;
        int secondNum = 0;


        for (int i = intervalStart; i <= endOfInterval; i++) {
            if (found){
                break;
            }
            for (int j = intervalStart; j <= endOfInterval ; j++) {
                combinationCounter++;
                if (i + j == magicNumber){
                    found = true;
                    firstNum = i;
                    secondNum = j;
                    break;
                }
            }
        }
        if (found){
            System.out.printf("Combination N: %d (%d + %d = %d)",combinationCounter, firstNum, secondNum, magicNumber);
        }else{
            System.out.printf("%d combinations - neither equals %d",combinationCounter,magicNumber);
        }
    }
}
