import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin : ");
        int n = input.nextInt();

        //4
        for (int i = 1; i <= n; i*=4){
            System.out.println(i);
        }

        System.out.println("*******************");
        // 5
        for (int i = 1; i <= n; i*=5){
            System.out.println(i);
        }

    }
}
