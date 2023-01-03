
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fibX = 0, fibY = 1, next;

        System.out.print("Fibonacci serisini giriniz: ");
        int number = input.nextInt();

        System.out.print(fibX + " " + fibY);

        for (int i = 1; i < number; i++) {
            next = fibX + fibY;
            System.out.print(" " + next);
            fibX = fibY;
            fibY = next;
        }

    }
}
