package src;

import java.util.Scanner;
public class PatikaStore {
    Scanner input = new Scanner(System.in);

    public void run(){
        // To start the program we to need the default constructors
        new Notebook();
        new Phone();
        new Brands();

        boolean isExit = false;
        while (!isExit){
            System.out.println("\n==== PatikaStore Product Management Panel =====");
            System.out.println("1- Notebook Operations");
            System.out.println("2- Phone Operations");
            System.out.println("3- List of Brands");
            System.out.println("0- Exit");
            System.out.print("Select your choice: ");

            int select = input.nextInt();
            while (select < 0 || select > 3){
                System.out.println("Wrong selection, Try Again: ");
                select = input.nextInt();
            }

            switch (select) {
                case 1 -> Notebook.menu();
                case 2 -> Phone.menu();
                case 3 -> Brands.printBrands();
                case 0 -> isExit = true;
                default -> {
                    System.out.println();
                    System.out.println("There is no such an option. Please enter your choice again. ");
                    System.out.println();
                }
            }
            if (isExit){
                System.out.println("\nProgram Termination...");
            }
        }
    }
}
