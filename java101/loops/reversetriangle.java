import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int basValue;

        System.out.print("Basamak sayisini girin: ");
        basValue = input.nextInt();

        for (int i = 1; i <= basValue; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = (2 * basValue) - i; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
