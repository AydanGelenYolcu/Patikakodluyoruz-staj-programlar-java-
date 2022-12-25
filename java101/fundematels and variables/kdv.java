import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("fiyatı giriniz " );
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();

        double kdv = (price <= 1000) ? 0.18 : 0.08;
        double kdvvalue = price * kdv;
        double totalPrice = kdvvalue + price;
        System.out.println("kdv percentage " + kdv);
        System.out.println("kdv value " + kdvvalue);
        System.out.println("kdv total price " + totalPrice);
    }
}
