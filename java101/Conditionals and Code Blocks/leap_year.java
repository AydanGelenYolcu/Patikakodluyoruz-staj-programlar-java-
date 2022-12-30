import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the year: ");
        year = scan.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " it is a leap year");
            } else {
                System.out.println(year + " it is not a leap year");
            }

        } else if (year % 4 == 0) {
            System.out.println(year + " it is a leap year");
        } else {
            System.out.println(year + " it is not a leap year");
        }

    }
}
