import java.util.Scanner;

public class gelismisHM {
    

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam:" + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("çıkarma:" + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("çarpma:" + result);
        return result;
    }

    static int dividede(int a, int b) {
        if (b == 0) {
            System.out.println("ikinci sayı sıfır olamaz ");
            return 0;
        }
        int result = a / b;
        System.out.println("bölme :" + result);
        return result;

    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("çevresi" + (2 * (a + b)));
        System.out.println("alanı:" + (a * b));

    }


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int select;

        String menu = "1-toplama işlemi\n"
                + "2-çıkarma işemi\n"
                + "3- çarpma işlemi\n"
                + "4-bölme işemi\n"
                + "5-üslü sayı hesaplama\n"
                + "6-mod alma \n"
                + "7-dikdörtgen alan ve çevresini hesaplama\n"
                + "0- çıkış";


        while (true) {


            System.out.println(menu);
            System.out.println("bir işlem seçiniz:");
            select = num.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("ilk sayıyı giriniz:");
            int a = num.nextInt();
            System.out.print("ikinci sayıyı giriniz:");
            int b = num.nextInt();
            int result = num.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;
                case 4:
                    dividede(a, b);
                    break;

                case 5:
                    System.out.println("üs hesabı :" + power(a, b));
                case 6:
                    System.out.println("mod işlemi:" + mod(a, b));
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("geçersiz işlem !!");


            }


        }

    }
}
