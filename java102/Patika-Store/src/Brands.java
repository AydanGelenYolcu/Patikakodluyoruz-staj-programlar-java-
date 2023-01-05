package src;

import java.util.LinkedHashMap;

public class Brands {
    private int id;
    private String name;
    private static  String[] brandArray = new String[9];
    public static LinkedHashMap<Integer,String> brandList = new LinkedHashMap<>();

    public Brands(){
        brandList.put(1, "Samsung");
        brandList.put(2, "Lenovo");
        brandList.put(3, "Apple");
        brandList.put(4, "Huawei");
        brandList.put(5, "Casper");
        brandList.put(6, "Asus");
        brandList.put(7, "HP");
        brandList.put(8, "Xiaomi");
        brandList.put(9, "Monster");

        brandArray = brandList.values().toArray(new String[0]);
    }
    // brand control
    public static boolean isThere(String enteredBrand){
        for (String brand: brandArray){
            if (enteredBrand.equals(brand)){
                return true;
            }
        }
        return false;
    }
    public static void printBrands() {

        // When listing brands, they should always be listed in alphabetical order.
        compare(brandArray);
        System.out.println("\nBRANDS\n----------");
        for (String brand : brandArray) {
            System.out.println("- " + brand);
        }
    }
    public static void printWithId(){
        for (int i = 0; i < brandArray.length;i++){
            System.out.println((i+1)+"- "+brandArray[i]);
        }
    }
    private static void compare(String[] brands){
        for (int i = 0; i < brands.length;i++){
            String first = brands[i];
            int index = i;
            for (int j = i + 1; j < brands.length;j++){
                int result = first.compareTo(brands[j]);
                if (result > 0){
                    first = brands[j];
                    index = j;
                }
                String temp = brands[i];
                brands[i] = first;
                brands[index] = temp;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String[] getBrandArray() {
        return brandArray;
    }

    public static void setBrandArray(String[] brandArray) {
        Brands.brandArray = brandArray;
    }
}
