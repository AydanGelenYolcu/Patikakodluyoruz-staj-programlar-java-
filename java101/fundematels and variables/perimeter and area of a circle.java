import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        double pi = 3.14;
        double perim, area;
        int r;
        System.out.print("please enter the radius ");
        r = input.nextInt();
        area = pi * (r*r);
        perim = 2 * pi * r;
        System.out.print("area is " + area + ", perimeter is " + perim);
    }
}
