import java.util.Comparator;
import java.util.TreeSet;


public class Main {


   public  static void main(String[] args){
       TreeSet<IBook> book =new TreeSet<IBook>();

       IBook book1 =new IBook("Hayrinin Not Defteri",120,"Hayri demiray",2018);
       IBook book2 =new IBook("Gupsenin Anıları",200,"Gupse akay",2015);
       IBook book3 =new IBook("Anılarla Yaşam",170,"Beyzanur Gündoğdu",2009);
       IBook book4 =new IBook("Bıkmışlık",2400,"Alperen Şanlı",2020);
       IBook book5 =new IBook("Şİnasi",150,"Şinasi Eşref Paşa",1956);

       book.add(book1);
       book.add(book2);
       book.add(book3);
       book.add(book4);
       book.add(book5);

       for (IBook b :book) {

           System.out.println("Book Name : " + b.getBookName()+
                   "  Page Number : " + b.getPageNum()+
                   "  Author Name : " + b.getAuthorName()+
                   "  Date : " + b.getDate());
           System.out.println("--------------------------------------------------------------------");
       }
       System.out.println("#############################################################################");

       TreeSet<IBook>bookPage=new TreeSet<>(new Comparator<IBook>() {
           @Override
           public int compare(IBook o1, IBook o2) {
               if (o1.getPageNum() == o2.getPageNum()){
                   return o1.getBookName().compareTo(o2.getBookName());
               }

               return o1.getPageNum()-o2.getPageNum();
           }

       });

       bookPage.add(book1);
       bookPage.add(book2);
       bookPage.add(book3);
       bookPage.add(book4);
       bookPage.add(book5);

       for (IBook num:bookPage ) {
           System.out.println("Book Name : " + num.getBookName()+
                   "  Page Number : " + num.getPageNum()+
                   "  Author Name : " + num.getAuthorName()+
                   "  Date : " + num.getDate());
           System.out.println("--------------------------------------------------------------------");

       }
       
   }
}
