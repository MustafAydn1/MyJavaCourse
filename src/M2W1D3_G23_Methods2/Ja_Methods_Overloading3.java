package M2W1D3_G23_Methods2;

public class Ja_Methods_Overloading3 {

    // Kullanıcı bir öğretmendir.
// Önce Öğrencinin adı girilecek, sonra aldığı farklı miktardaki notlar girilecek
// Ahmet Demir  bu okunduktan sonra
// 80 56 78 90  okutulacak ve öğrenci adı ve ortalaması yazılacak ekrana
// ortlama bulma işlemini bir fonksiyonda yapınız, fakat sonucu yazdırma işlemini
// mainde yaptırınız.Her öğrenci farklı sayıda not girilebilir.

    public static void main(String[] args) {

        ÖğrenciNotlari("Ahmet DEMİR",23,67,89,90,56,78,23,45);

    }

    public static void ÖğrenciNotlari(String  adSoyad,int... notlar){
        double toplam=0;
        for (int i = 0; i <notlar.length ; i++) {

            toplam+=notlar[i];

        }
        double ort=toplam/notlar.length;
        System.out.println(adSoyad+" =  "+ort);
    }

}
