import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabsOpen = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tabsOpen; i++) {
            String website = scanner.nextLine();
            if (website.equals("Facebook")){
                salary -= 150;
            }else if (website.equals("Instagram")){
                salary -= 100;
            }else if (website.equals("Reddit")){
                salary -= 50;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
