package M3W3D3_G50_Interface.task1;

import java.util.ArrayList;

/*
Bir okulun çalışanı ve öğrencilerinin kayıt altına alındığı bir program yapılmak isteniyor.
        1- Calisan ların isim, adres, Okul, maas ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
        2- Öğrenci lerin isim, adres, Okul, ücret ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
        3- Okul un ise ismi, maxOgrenciSayisi, Öğrencileri ve Calisanlari vardır.

 */
public class Okul {

    private String isim;
    private int maxOgrenciSayisi;
 //   private ArrayList<Ogrenciler> ogrenciler=new ArrayList<>();
 //   private ArrayList<Calışanlar> calisanlar=new ArrayList<>();
// böyle kalsa da olur. cons. a eklemeye gerek yok... YADA..
 private ArrayList<Ogrenciler> ogrenciler;
 private ArrayList<Calisanlar> calisanlar;
// yapılır ve eklenir...

    public Okul(String isim, int maxOgrenciSayisi) {
       setIsim(isim);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
        ogrenciler=new ArrayList<>();
        calisanlar=new ArrayList<>();
    }

    public void  OgrenciKayit(Ogrenciler ogr){
        ogrenciler.add(ogr);
    }

    public void  CalisanKayit(Calisanlar calisan){
        calisanlar.add(calisan);
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenciler> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenciler> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public ArrayList<Calisanlar> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(ArrayList<Calisanlar> calisanlar) {
        this.calisanlar = calisanlar;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                ", calisanlar=" + calisanlar +
                '}';
    }

    public void OgrenciListele(){
        for(Ogrenciler ogr: ogrenciler)
            System.out.println(ogr);// Ogernciler classının toStringini kullanacak
    }

    public  void CalisanListele(){

        for(Calisanlar cal: calisanlar)
            System.out.println(cal); //calişanlar class toString
    }


}
/*
// Ogrenci ve Calisanlar okula kayıt yapılacağından
// kayıt işlemi Okul sınıfının içerisinde olmalı,
// bu yüzden ArrayList ler ve kayıt işlemi Okul
// sınıfın içine yazıldı.
 */