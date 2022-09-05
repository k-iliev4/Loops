import java.util.Scanner;

public class Relocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int size = width * length * height;

        while(size >= 0){
            String input = scanner.nextLine();
            if (input.equals("Done")){
                break;
            }
            int inp = Integer.parseInt(input);
            size -=inp;
        }
        if (size<0){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(size));
        }else{
            System.out.printf("%d Cubic meters left.",size);
        }
    }
}
