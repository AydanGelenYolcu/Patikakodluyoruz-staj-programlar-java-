import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        int weight_kg;
        double h_cm, bmi;
        System.out.print("Please enter your weight as kg: ");
        weight_kg = input.nextInt();
        System.out.print("Please enter your height as in meter (please use .): ");
        h_cm = input.nextDouble();
        bmi = weight_kg / (h_cm * h_cm);
        System.out.println("Your bmi is " + bmi);

    }
}
