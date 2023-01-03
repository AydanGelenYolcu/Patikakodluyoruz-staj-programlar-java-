public class Main {
    public static void main(String[] args) {

        /* Asal sayılar, sadece iki pozitif tam sayı böleni olan doğal sayılardır.
        Sadece kendisine ve 1 sayısına kalansız bölünebilen 1'den büyük tam sayılardır.
         */
        int counter = 0;
        int i, j;

        for (i = 1; i < 100; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(" " + i);
            }
            counter = 0;
        }
    }
}
