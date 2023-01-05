package src;

import java.util.ArrayList;
import java.util.List;

public class Notebook extends Product{
    public Notebook(int id, double price, double discountRate, int amount, String name, String brand, int memory, double screenSize, int RAM) {
        super(id, price, discountRate, amount, name, brand, memory, screenSize, RAM);
    }
    public Notebook(){
        notebookList.add(new Notebook(1, 7000, 10, 5, "Huawei Matebook 14", "Huawei", 512, 14, 16));
        notebookList.add(new Notebook(2, 3699, 10, 5, "Lenovo V14 IGL", "Lenovo", 1024, 14, 8));
        notebookList.add(new Notebook(3, 8199, 10, 5, "Asus Tuf Gaming", "Asus", 2048, 15.6, 32));
    }

    public static void menu(){
        System.out.println("""

                ===== Notebook Management Panel =====
                1- Add A New Notebook
                2- Print Notebook List
                3- Delete Notebook
                4- Sort Notebooks By ID Number
                5- Filter Notebooks By Brands""");
        System.out.print("Select Your Choice: ");
        int select = input.nextInt();

        while (select < 0 || select > 5){
            System.out.println("Wrong selection, Try again: ");
            select = input.nextInt();
        }
        switchCaseNotebook(select);
    }
    public static void switchCaseNotebook(int select){
        switch (select) {
            case 1 -> add("Notebook");
            case 2 -> print(notebookList);
            case 3 -> remove();
            case 4 -> sort();
            case 5 -> filterByBrand();
            default -> {
                System.out.println();
                System.out.println("There is no such an option. Please enter your choice again. ");
                System.out.println();
            }
        }
    }
    public static void print(List<Notebook> notebooks){
        System.out.println("| ID | Name of Product               | Price     | Brand     | Memory  | Screen Size | RAM      |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks){
            System.out.printf("| %-2d | %-29s | %-9.1f | %-9s | %-7d | %-11.1f | %-8d |", notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrand(), notebook.getMemory(), notebook.getScreenSize(), notebook.getRAM());
            System.out.println();
        }
    }
    public static void sort(){
        List<Notebook> sortById = notebookList;

        sortById.sort((o1, o2) -> o1.getId() - o2.getId());
        print(sortById);
    }
    public static void filterByBrand(){
        String[] brandArray = Brands.getBrandArray();
        Brands.printWithId();

        System.out.println("Enter the id number of the brand you want to filter: ");
        int select = input.nextInt();
        if (select > 0){
            String selectBrand = brandArray[select - 1];

            List<Notebook> notebooksByBrand = new ArrayList<>();

            for (Notebook notebook : notebookList){
                if (notebook.getBrand().equals(selectBrand)){
                    notebooksByBrand.add(notebook);
                }
            }
            if (notebooksByBrand.size() != 0){
                print(notebooksByBrand);
            }else {
                System.out.println("There are no products from this brand !!");
            }
        }else {
            System.out.println("\nDo not enter a negative number !!!");
        }
    }

    public static void remove(){
        print(notebookList);
        System.out.println("Enter the di of the phone you want to delete: ");
        int select = input.nextInt();
        int removeID = - 1;
        for (Notebook notebook : notebookList){
            if (notebook.getId() == select){
                removeID = notebookList.indexOf(notebook);
            }
        }
        if (removeID != -1){
            notebookList.remove(removeID);
            System.out.println("Notebook is deleted");
        }
    }
}
