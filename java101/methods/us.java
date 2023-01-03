import java.util.Scanner;
public class Main {
    public static int usHesaplama(int taban, int us){
        int sonuc = 1;
        for (int i = 1; i <= us; i++){
            sonuc *= taban;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini girirniz: ");
        int us = input.nextInt();
        int sonuc = usHesaplama(taban, us);
        System.out.println("Sonuc: " + sonuc);
    }
}
