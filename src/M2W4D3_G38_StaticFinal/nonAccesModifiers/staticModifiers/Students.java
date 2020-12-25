package M2W4D3_G38_StaticFinal.nonAccesModifiers.staticModifiers;

public class Students {
    public static void main(String[] args) {

       Student ogre=new Student("Ali","deli");
       Student ogren=new Student("Veli","keser");
       Student ogrenc=new Student("Mehmet","biçer");
       // ...

        Student ogrcn= new Student("Ayse","sahin");


        System.out.println("Student.ogrenciSayisi = " + Student.ogrenciSayisi);

        System.out.println("ogre = " + ogre);
        System.out.println("ogren = " + ogren);
        System.out.println("ogrenc = " + ogrenc);
        System.out.println("ogrcn = " + ogrcn);

// Static anahtar ının 3 adet kullanım amacı var.
// 1- Metoda ve fileda direk class üzerinden ulaşım.
// 2- Tekrarlanan ifadeler için hafızayı iyi kullanma
// 3- Oluşturulan nesneler için sayaç görevi için de kullanılır.

    }
}
