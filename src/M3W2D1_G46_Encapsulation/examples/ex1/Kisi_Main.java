package M3W2D1_G46_Encapsulation.examples.ex1;

public class Kisi_Main {
    public static void main(String[] args) {

        //Kisi kisi1=new Kisi("Ali","veli",-38);

        Kisi kisi1=new Kisi();


        kisi1.name="Mustafa";
        kisi1.soyad="Aydın";
        kisi1.setYas(-38);
        System.out.println("kisi1.getYas() = " + kisi1.getYas());





        // prıvate fields i public set metoduyla Şarta bağlı olarak hazırladığım için
        //burada hatalı girişde olsa hatayı düzeltip get ile okuttum.





    }
}
