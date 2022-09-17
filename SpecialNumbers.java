import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = Double.parseDouble(scanner.nextLine());
        boolean legit = false;

        for (int i = 1111; i <=9999 ; i++) {

            String temp = String.valueOf(i);

            for (int j = 0; j <temp.length() ; j++) {
                char curr = temp.charAt(j);
                double curr1 = Double.parseDouble(String.valueOf(curr));
                if (curr1 == 0){
                    legit = false;
                    break;
                }
                if (N % curr1 > 0){
                    legit = false;
                    break;
                }else{
                    legit = true;
                }

            }
            if (legit){
                System.out.print(i+ " ");
            }

        }
    }
}
