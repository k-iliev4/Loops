import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestNum = Integer.MIN_VALUE;

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                break;
            }
            int inp = Integer.parseInt(input);
            if (inp > biggestNum){
                biggestNum = inp;
            }
        }
        System.out.println(biggestNum);
    }
}
