import java.util.Scanner;

public class SumVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int points = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a'){
                points += 1;
            }else if (word.charAt(i)=='e'){
                points+=2;
            }else if (word.charAt(i)=='i'){
                points+=3;
            }else if (word.charAt(i)=='o'){
                points+=4;
            }else if (word.charAt(i)=='u'){
                points+=5;
            }

        }
        System.out.println(points);
    }
}
