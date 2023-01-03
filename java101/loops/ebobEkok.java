import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int s1, s2, ebob = 1, ekok = 1, i = 1, j = 1;

        System.out.print("1.sayiyi giriniz: ");
        s1 = input.nextInt();

        System.out.print("2.sayiyi giriniz: ");
        s2 = input.nextInt();

        if (s1 < s2) {
            while (i <= s1) {
                if (s1 % i == 0 && s2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= s2) {
                if (s1 % i == 0 && s2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("Sayilarin ebobu: " + ebob);
        System.out.print("");

        while (s1 * s2 >= j) {
            if (j % s1 == 0 && j % s2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.print("Sayilarin ekoku: " + ekok);
    }
}
