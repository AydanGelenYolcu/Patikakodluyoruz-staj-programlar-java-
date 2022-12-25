import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int english, french, japanese;
        Scanner girdi = new Scanner(System.in);
        System.out.print("your english note: ");
        english = girdi.nextInt();

        System.out.print("your french notes: ");
        french = girdi.nextInt();

        System.out.print("your japanese notes: ");
        japanese = girdi.nextInt();

        int toplam = japanese + english + french;
        int ort = toplam/3;
        String str = (ort >= 60) ? "Sınıfı Gecti" : "Sınıfta Kaldı";
        System.out.print("Ortalmanız: " + ort + " Durumunuz: " + str);

    }

}