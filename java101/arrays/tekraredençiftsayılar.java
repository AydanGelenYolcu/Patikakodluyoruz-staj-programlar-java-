import java.util.Arrays;

public class tekrar {

    public static void main(String[] args) {
        int[] sayi = {1, 2, 4, 5, 6, 4, 8, 9, 0, 6, 8, 0, 12};
        Arrays.sort(sayi);
        int count = 0;
        int num = sayi[0];
        System.out.println("Tekrar eden sayılar");

            for (int i = 0; i < sayi.length; i++) {
                if (i == 0 || num != sayi[i]) {
                    if (i%2==0) {
                        for (int k : sayi) {
                            if (k == sayi[i]) {
                                count++;
                                num = sayi[i];
                            }
                        }
                    }

                    System.out.println(sayi[i] + " : sayısı =>" + count + " kere tekrar etti");
                    count = 0;
                }
            }
        }
    }
