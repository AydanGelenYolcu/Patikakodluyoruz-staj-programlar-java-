public class Main {
    public static void main(String[] args) {
        //Matrisin transpozunu (devriğini) almak,
        // matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int yenisi[][] = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("  ------------    ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                yenisi[i][j] = matrix[j][i];
                System.out.print(yenisi[i][j] + " ");
            }
            System.out.println();

        }

    }
}
