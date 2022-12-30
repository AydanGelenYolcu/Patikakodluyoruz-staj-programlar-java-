import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Eleman sayısını girin: ");
		int n = scanner.nextInt();
		System.out.print("Seçim sayısını girin: ");
		int r = scanner.nextInt();
		int nFactorial = 1;
		int rFactorial = 1;
		
		for(int i = 1; i <= r; i++) {
			rFactorial *= i;
			nFactorial *= n;
			n--;
		}
		
		int comb = nFactorial / rFactorial;
		System.out.println("C(" + n + "," + r + ") kombinasyonu: " + comb);

	}
}
