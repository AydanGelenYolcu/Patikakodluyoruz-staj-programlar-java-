package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private int id;

    private static int phoneCount = 3;
    private static int notebookCount = 3;
    private double price;
    private double discountRate;
    private int amount;
    private String name;
    private String brand;
    private int memory;
    private double screenSize;
    private int RAM;
    public static List<Notebook> notebookList = new ArrayList<>();
    public static List<Phone> phoneList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public Product(int id, double price, double discountRate, int amount, String name, String brand, int memory, double screenSize, int RAM) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.RAM = RAM;
    }
    public Product(){

    }
    public static void add(String nameClass){
        try{
            System.out.print("Name:");
            String name = input.next();
            input.nextLine();
            System.out.print("Brand: ");
            String brand = input.nextLine();
            // my first letter upper and other letters lower
            brand = brand.substring(0,1).toUpperCase()+brand.substring(1).toLowerCase();
            System.out.print("Memory: ");
            int memory = input.nextInt();
            System.out.print("Screen size: ");
            double screenSize = input.nextDouble();
            System.out.print("RAM: ");
            int RAM = input.nextInt();
            System.out.print("Unit Price: ");
            double price = input.nextDouble();
            System.out.print("Discount Rate ");
            double discountRate = input.nextDouble();
            System.out.print("Stock Amount: ");
            int amount = input.nextInt();

            if (!Brands.isThere(brand)){
                System.out.println("This brand is not on the list");
            } else if (nameClass.equals("CellPhone")) {
                System.out.print("Battery: ");
                int battery = input.nextInt();
                System.out.print("Color: ");
                String color = input.next();
                color += input.nextLine();
                System.out.print("Camera: ");
                int camera = input.nextInt();

                setPhoneCount(getPhoneCount() + 1);

            }

        }catch (Exception e){
            System.out.println("\nSomething went wrong !!!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getPhoneCount() {
        return phoneCount;
    }

    public static void setPhoneCount(int phoneCount) {
        Product.phoneCount = phoneCount;
    }

    public static int getNotebookCount() {
        return notebookCount;
    }

    public static void setNotebookCount(int notebookCount) {
        Product.notebookCount = notebookCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
