package M2W4D1_G36_Constructors.tasks.task1;

public class Task1 {
    public static void main(String[] args) {

        Book book1=new Book("sozler",1930,"BSN");
        Book book2=new Book("Lemalar",1937);
        Book book3=new Book("MEKTUBAT");
        Book book4=new Book();
        book4.name="Sualar";


        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();
        book4.ShowInfo();


        int sayi=5;
        System.out.println(sayi);// toString yapıp string olarak yazıyor.otomatik.

        System.out.println(book1);
        System.out.println(book1.toString());// aslında bunu yapmış oluyor.


        System.out.println(book2);
        System.out.println(book3);
        System.out.println("book2 yılı = " + book2.publishYear);

        System.out.println("book2 = " + book2.toString1());// sadece yazılanları yazdırır.
        // çünkü elle yazdın. to string gibi default degerleri yazmazç
    }


}
