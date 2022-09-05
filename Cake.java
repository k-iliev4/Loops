import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int size = length * width;

        while (size >= 0) {
            String taking = scanner.nextLine();
            if (taking.equals("STOP")) {
                break;
            }
            int take = Integer.parseInt(taking);
            size -= take;
        }
        if (size >=0) {
            System.out.println(size);
        }else{
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(size));
        }
    }
}
