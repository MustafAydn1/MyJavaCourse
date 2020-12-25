package M3W4D1_G53_Interfaces.Task.task1;

public class Circle implements IShape {

   // public Circle(int yariCap) {
   // }
    //Eger soyut metod da  int...values dizisini kullanmasaydık
    //herşekil için r,lenght,widht, gibi fields girecektik.
    //Bunlara gerek kalmadı.

    @Override
    public int Area(int... dizi) {

        return (int)(PI*dizi[0]*dizi[0]);
    }

    @Override
    public int Perimeter(int... dizi) {
        return (int)(2*PI*dizi[0]);
    }
 //burada sonuclar double cıkacak.metodu int ten doubleye ceviremem.
 // yapmak isteyince,interface de git degiştir diyor.
 //interface de nasıl geldiyse o bozulamaz.TYPECASTİNG yap.
}
