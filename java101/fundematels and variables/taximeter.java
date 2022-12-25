import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        int km;
        double per_km=2.20 , total, StartPrice=10;
        System.out.print("what km is the distance ");
        km= input.nextInt();
        total= (km * per_km);
        total +=StartPrice;
        total= (total<20 ? 20 : total);
        System.out.println("total price: "+ total);
    }
}
