package M2W4D2_G37_AccessModifiers.intanceModifiers.publicModifiers.other;

import M2W4D2_G37_AccessModifiers.intanceModifiers.publicModifiers.same.SearchEngine;

public class EdgeBrowser {
    public static void main(String[] args) {

   //diger paketteki bu Contructor a ulastım.public old.için
    SearchEngine microsoft=new SearchEngine("explorer");
    //public class SearchEngine deki publici sil gör. kızarır.

    microsoft.name="Edge";//diger paketteki fields e de ulastım
        //public String name deki public i sil. name kıazrır.


        System.out.println("microsoft = " + microsoft);

}
}