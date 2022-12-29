import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner manav = new Scanner(System.in);

        double armut =2.14;
        double elma = 3.67;
        double domates =1.11;
        double muz =0.95;
        double patlican =5.00;

        System.out.println("Armut kaç kilo : ");
        double armutKilo = manav.nextDouble();

        System.out.println("Elma kaç kilo : ");
        double elmaKilo = manav.nextDouble();

        System.out.println("Domates kaç kilo : ");
        double domatesKilo = manav.nextDouble();

        System.out.println("Muz kaç kilo : ");
        double muzKilo = manav.nextDouble();

        System.out.println("Patlican kaç kilo : ");
        double patlicanKilo = manav.nextDouble();

        double toplam =(armut*armutKilo)+(elma*elmaKilo)+ (domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam Tutar: " + toplam);

    }
}
