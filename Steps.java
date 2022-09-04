import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;

        while (steps <= 10000){
            String input = scanner.nextLine();
            if (input.equals("Going home")){
                int a = Integer.parseInt(scanner.nextLine());
                steps+=a;
                break;
            }
            steps+=Integer.parseInt(input);
        }
        if (steps >= 10000){
            System.out.printf("Goal reached! Good job! %d steps over the goal!",steps - 10000);
        }else{
            System.out.printf("%d more steps to reach the goal",10000-steps);
        }


    }
}
