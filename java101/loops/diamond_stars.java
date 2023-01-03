import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int k = 1; k <= (number - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 1; l <= number; l++) {
            for (int z = 0; z <= l; z++) {
                System.out.print(" ");
            }
            for (int m = (2 * number) - 1; m >= (2 * l) + 1; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
