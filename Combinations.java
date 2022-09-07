import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <=25 ; i++) {
            for (int j = 0; j <= 25; j++) {
                for (int k = 0; k <= 25; k++) {
                    if (i+j+k == 25){
                        counter++;
                    }
                }

            }

        }
        System.out.println(counter);
    }
}
