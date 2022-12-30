import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,total=0;

        // Tek sayıların toplamı
        /*do {
            System.out.print("1 Sayı Girin : ");
            n = input.nextInt();
            if (n%2==1)
                total += n;
        }while (n>0);*/

        // 4 üstü sayıları toplamı
        do{
            System.out.print("1 Sayı Giriniz : ");
            n= input.nextInt();
            if (n%2==0 && n%4==0)
                total+=n;
        }while (n>0);

        System.out.println(total);

    }
}
