package M3W4D1_G53_Interfaces.Task.task1;

public interface IShape {

    final double PI=3.14;
   final int kenar=4;
   static int kenar1 = 0;




 //   int Area(int...values);
 //   int perimeter(int ...values);

/* birsey dönderecegi için void değil int olmalı.

metod overloading yapmalıyız.CUNKU;
HER ŞEKLİN ALAN VE  CEVRESİ İÇİN GİRİLECEK,
deger sayısı farklıdır.imlement edecek classların fieldsi.
Ayrıca parametre belirlemesini interface de yapacaksın
implementslere bırakamazsın.
int... value DEMEK; Value DİZİ GİBİ DAVRANIR.HERZAMAN.
values yerine dizi yazalım...
dizi[0],dizi[1],dizi[2],... gibi gelen sayı kadar
işlem görur.
 */

    int Area(int...dizi);
    int Perimeter(int...dizi);

    // int...values kullanıldığında gelen bütün sayılar
    // dizinin bir elemanı gibi işlem görür ve dizi değişkenine
    // atanır

//İNTERFACE DE CONSTRUCTOR OLAMAZ....
//Interface de final ve static fields dışında fields da oluşturulamaz.
// final ve static in de const. oluşturulamayacagi için ilk degeri şart.

}
