import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  age,discount,a;
        double price,pricew=0.10,km;
        System.out.print("please enter the distance as km ");
        km= input.nextDouble();
        price=km * pricew;

        System.out.print("please enter your age:");
        age= input.nextInt();
        if (age<12){
            price=price/2;
        } else if ((age>=12)&&(age<24)) {
            price=price-price/10;
        }else if (age>65){
            price=price-(3*price/10);
        }
        System.out.println("please select the one way or including return");
        System.out.println("1: oneway");
        System.out.println("2: including return");
        a= input.nextInt();
        switch (a) {
            case 1:
                System.out.println("total price: " + price);
                break;
            case 2:
                price=price-(2*price/10);
                System.out.println("total price: " + price);
                break;
            default:
                System.out.println("You entered wrong number, please control it!");
        }

    }
}
