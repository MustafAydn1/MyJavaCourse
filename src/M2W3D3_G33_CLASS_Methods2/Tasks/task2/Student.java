package M2W3D3_G33_CLASS_Methods2.Tasks.task2;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersListesi;// dikkat!!!!! aRRYlİST Lesson class nın elemanlArı ile dolacak...
//Böylece  Lesson Classı ile Student arasında bağ kurulmus oldu.BU YUZDEN TİPİ Lesson oldu.

    public  int totalCredit () {
        int total=0;
        for(Lesson ders: dersListesi)
            total+=ders.credit;
        return  total;
    }

    //public  int totalCredit (Lesson...dersler) {} şeklinde yapmayı dene.main sade olsun


}
