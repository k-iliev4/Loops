import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cap = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(sum<cap){
            int number = Integer.parseInt(scanner.nextLine());
            sum+=number;
        }
        System.out.println(sum);
    }
}
