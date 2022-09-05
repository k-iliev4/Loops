import java.util.Scanner;

public class Row2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 1;

        while (num >= sum){
            System.out.println(sum);
            sum = sum * 2 + 1;
        }
    }
}
