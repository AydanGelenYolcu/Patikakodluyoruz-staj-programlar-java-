import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0, adet, i = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("Kaç tane sayi gireceksiniz: ");
        adet = input.nextInt();

        do {
            System.out.print(i + " . sayiyi giriniz: ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            i++;
        } while (adet >= i);

        System.out.println("En büyük sayi: " + max);
        System.out.println("En küçük sayi: " + min);

    }
}
