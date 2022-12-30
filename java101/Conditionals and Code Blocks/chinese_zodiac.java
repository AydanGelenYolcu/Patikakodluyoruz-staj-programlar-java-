import java.util.Scanner;

public class CinZodyagiHesaplama {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil;
        String cinZodyak = null;
        System.out.println("Hoşgeldiniz.");
        System.out.print("Lütfen doğum yılınızı giriniz: "); yil = sc.nextInt();
        switch (yil%12) {
            case (0) : cinZodyak = "Maymun"; break;
            case (1) : cinZodyak = "Horoz"; break;
            case (2) : cinZodyak = "Köpek"; break;
            case (3) : cinZodyak = "Domuz"; break;
            case (4) : cinZodyak = "Fare"; break;
            case (5) : cinZodyak = "Öküz"; break;
            case (6) : cinZodyak = "Kaplan"; break;
            case (7) : cinZodyak = "Tavşan"; break;
            case (8) : cinZodyak = "Ejderha"; break;
            case (9) : cinZodyak = "Yılan"; break;
            case (10) : cinZodyak = "At"; break;
            case (11) : cinZodyak = "Koyun"; break;
        }

        System.out.println("Çin zodyağınız : " + cinZodyak);
    }
}
