package HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> booksList = new ArrayList<>();      // Kitap listesini tutacak
        HashMap<String, String> mapList = new HashMap<>();    // Kitap isim ve yazar tutacak
        ArrayList<Book> newList = new ArrayList<>();

        booksList.add(new Book("Ince Memed", 23, "Sanane"));
        booksList.add(new Book("Kalın", 123, "banane"));
        booksList.add(new Book("Asena", 243, "furkan"));
        booksList.add(new Book("Ince", 521, "subay"));
        booksList.add(new Book("Duzgun", 123, "faruk"));
        booksList.add(new Book("Yuvarlak", 543, "donkisot"));
        booksList.add(new Book("Ev", 732, "tuba"));
        booksList.add(new Book("Daire", 24, "ela"));
        booksList.add(new Book("Arsa", 12, "omer"));
        booksList.add(new Book("Yazilim", 2319, "sakine"));
        booksList.stream().forEach(book -> {         // Foreach kullanarak her bir iteme işlem yapabılıyoruz. Ve biz her itemi map listine gerekenleri atıyoruz.
            mapList.put(book.getName(), book.getAuthor());
        });
        for (String st : mapList.keySet()) {       //maplistin keylerinden foreach yaz.Sonra keyleri yazdır ve get methodu ile keyinden yararlanarak map yazdır.
            System.out.println("Kitabin ismi:\t" + st + "\t Kitabin yazari:\t" + mapList.get(st));
        }
        booksList.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> newList.add(book));   // Yeni listeye aktar sayfası 100den fazla ise.
        System.out.println("##########################");
        newList.forEach(book -> System.out.println("Kitabin ismi:\t" + book.getName() + " ,\tKitabin yazari:\t" + book.getAuthor()));


    }
}
