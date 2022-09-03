import java.util.Scanner;

public class TrackingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        double group1 = 0;//Musala
        double group2 = 0;//Moblan
        double group3 = 0;//Kilimandjaro
        double group4 = 0;//k2
        double group5 = 0;//Everest
        int totalPeople = 0;

        for (int i = 0; i < groupCount; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;

            if (people <= 5){
                group1+=people;
            }
            if (people >= 6 && people <=12){
                group2+=people;
            }
            if (people >=13 && people <=25){
                group3+=people;
            }
            if (people >= 26 && people <=40){
                group4+=people;
            }
            if (people >=41){
                group5+=people;
            }
        }
        System.out.printf("%.2f%%\n",group1/totalPeople * 100);
        System.out.printf("%.2f%%\n",group2/totalPeople * 100);
        System.out.printf("%.2f%%\n",group3/totalPeople * 100);
        System.out.printf("%.2f%%\n",group4/totalPeople * 100);
        System.out.printf("%.2f%%\n",group5/totalPeople * 100);
    }
}
