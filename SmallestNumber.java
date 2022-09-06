import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;

        while(true){
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                break;
            }
            int number = Integer.parseInt(input);
            if (number < minNumber){
                minNumber = number;
            }
        }
        System.out.println(minNumber);
    }
}
