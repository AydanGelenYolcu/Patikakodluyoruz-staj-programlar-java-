import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        System.out.println("kısa kenarı girin ");
        int a = input.nextInt();
        System.out.println("uzun kenarı girin ");
        int b = input.nextInt();
        System.out.println("hipotenüsün uzunluğunu girin ");
        int hypo = input.nextInt();
        
        int u = (a+b+hypo)/2;
        System.out.println("çevre " + 2*u);
        double alan = Math.sqrt(u * (u-a)* (u-b) * (u-hypo));
        System.out.println("alan " + alan);
    }
}
