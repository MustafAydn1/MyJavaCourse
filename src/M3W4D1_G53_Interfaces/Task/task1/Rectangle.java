package M3W4D1_G53_Interfaces.Task.task1;

public class Rectangle implements  IShape{
 /*   int lenght;
    int width;

    public Rectangle(int lenght,int width) {
        this.lenght=lenght;
        this.width=width;
    }
  */
 //Eger soyut metod da  int...values dizisini kullanmasaydık
 //herşekil için r,lenght,widht, gibi fields girecektik.
 //Bunlara gerek kalmadı.

    @Override
    public int Area(int... dizi) {
//if koşulunu kare için ekledik..TEK DEGER GİRMEK İÇİN.

      if(dizi.length==1)
        return dizi[0]*dizi[0];
      else return dizi[0]*dizi[1];
    }

    @Override
    public int Perimeter(int... dizi) {
        return 2*(dizi[0]+dizi[1]);
    }
}
