package M2W4D3_G38_StaticFinal.nonAccesModifiers.staticModifiers;

public class Student {

    int id;
    String name;
    String surName;
    static  int ogrenciSayisi=0;

// feilds variable yi(id) class variable ye(ogrenciSayisi) atayıp,her nesne olusumunda saydırdık
 //herbir nesne icin id olusturulup otomatik icine deger atiliyor.
//************************************************
//static int id=0; ve id++ dersen olmaz nedenni DÜŞŞŞŞÜÜÜNN.
//NIYE İKİ AŞAMALI YAPMAK ZORUNDAYIM.

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;


        ogrenciSayisi++;
       this.id=ogrenciSayisi;
// this ler kısmını tam yaz. Constructor da parametre eksik de olsa olur.
// this.fields i eksiksiz yaz.parametreler eksik olabilir...
// HER ÖGRENCİ OLUSUMUNDA,classın elemanı olan ogrenciSayisi +1 artar.
// Eger static olmasaydı(nesnenin elemanı olsaydı) sayac gorevi yapmazdı.
        //!!!!!!!!!!!!!!!!!!!!1

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
