package M2W4D2_G37_AccessModifiers.intanceModifiers.defaultmodifiers.other;

import M2W4D2_G37_AccessModifiers.intanceModifiers.defaultmodifiers.same.Book;

public class AmazonStore {
    public static void main(String[] args) {

  //Book kitap1=new Book();// default oldugundan diğer paketten ulaşılamz.


      Book kitap2= new  Book("Kar");//public, ulaştım.
        //Nesneler farklı classlarfda oldugu için aynı isimler verilebilir
        //nesne adı(kitap1 ve 2) yada
    }

}
