import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        boolean found = false;
        int bookCounter = 0;
        while (!found){

            String foundBook = scanner.nextLine();
            bookCounter++;

            if (foundBook.equals(book)){
                found = true;
                System.out.printf("You checked %d books and found it.",bookCounter);
                break;
            }
            if (foundBook.equals("No More Books")){
                bookCounter--;
                break;
            }
        }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.",bookCounter);
    }
}
