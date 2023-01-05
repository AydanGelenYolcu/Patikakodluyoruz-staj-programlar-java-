package src;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Product{
    private int battery;
    private String color;
    private int camera;

    public Phone(int id, double price, double discountRate, int amount, String name, String brand, int memory, double screenSize, int RAM, int battery, String color, int camera) {
        super(id, price, discountRate, amount, name, brand, memory, screenSize, RAM);
        this.battery = battery;
        this.color = color;
        this.camera = camera;
    }
    public Phone(){
        phoneList.add(new Phone(1, 3199, 10, 5, "Samsung Galaxy A51", "Samsung", 128, 6.5, 6, 4000, "Siyah", 32));
        phoneList.add(new Phone(2, 7379, 10, 5, "Iphone 11 64 GB", "Apple", 64, 6.1, 6, 3046, "Mavi", 5));
        phoneList.add(new Phone(3, 4012, 10, 5, "Redmi Note 10 Pro 8 GB", "Xiaomi", 128, 6.5, 12, 4000, "Beyaz", 35));

    }
    public static void menu(){
        System.out.println("""

                ===== Phone Management Panel =====
                1- Add A New Phone
                2- Print Phone List
                3- Delete Phone
                4- Sort Phones By ID Number
                5- Filter Phones By Brands""");
        System.out.print("Select Your Choice: ");
        int select = input.nextInt();
        while (select < 0 || select > 5){
            System.out.print("Wrong selection,Try again: ");
            select = input.nextInt();
        }
        switchCaseNotebook(select);
    }
    public static void switchCaseNotebook(int select){
        switch (select) {
            case 1 -> add("CellPhone");
            case 2 -> print(phoneList);
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
    public static void print(List<Phone> phones){
        System.out.println("| ID | Name of Product               | Price     | Brand     | Memory    | Screen Size | Camera    | Battery   | RAM       | Color      |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone phone:phones){
            System.out.printf("| %-2d | %-29s | %-9.1f | %-9s | %-9d | %-11.1f | %-9d | %-9d | %-9d | %-10s |",phone.getId(), phone.getName(), phone.getPrice(), phone.getBrand(), phone.getMemory(),
                    phone.getScreenSize(), phone.getCamera(), phone.getBattery(), phone.getRAM(), phone.getColor());
            System.out.println();
        }
    }

    public static void sort(){
        List<Phone> sortByID = phoneList;

        sortByID.sort((o1, o2) -> o1.getId() - o2.getId());
        print(sortByID);
    }

    public static void filterByBrand(){
        String[] brandArray = Brands.getBrandArray();
        Brands.printWithId();

        System.out.print("Enter the id number of the brand you want to filter: ");
        int select = input.nextInt();
        if (select > 0){
            String selectBrand = brandArray[select - 1];

            List<Phone> phonesByBrand = new ArrayList<>();

            for (Phone phone : phoneList){
                if (phone.getBrand().equals(selectBrand)){
                    phonesByBrand.add(phone);
                }
            }
            if (phonesByBrand.size() != 0){
                print(phonesByBrand);
            }else {
                System.out.println("There are no products from this brand !!");
            }
        }else {
            System.out.println("\nDo not enter a negative number !!!");
        }
    }
    public static void remove(){
        print(phoneList);
        System.out.print("Enter the id of the phone you want to delete: ");
        int select = input.nextInt();

        int removeId = -1;
        for (Phone phone : phoneList){
            if (phone.getId() == select){
                removeId = phoneList.indexOf(phone);
            }
        }
        if (removeId != -1){
            phoneList.remove(removeId);
            System.out.println("Phone is deleted");
        }
    }
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
