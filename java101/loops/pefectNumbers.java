import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
        toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */

        Scanner input = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Bir sayi giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if(total==number){
            System.out.print(number + " mükemmel sayidir.");
        }else {
            System.out.print(number + " mükemmel sayi değildir..");
        }
    }
