package M3W2D1_G46_Encapsulation.examples.ex1;

public class Kisi {
    String name;
    String soyad;
    private  int yas;



    public  void setYas(int yas)
    {
    // this.yas=Math.abs(yas); if li işlemin aynısını yaptın. kısa ve öz.

       if(yas>0)   this.yas=yas;

        else   this.yas=-yas;
    }
// burada metodla negatif girişleri engelledik.

    public int getYas()
    {

        return  this.yas;
    }

  // yaşa ulaşabilirsin alabilirsin. ama benim istediğim şekilde..Ve kuralla.

//set ile metod yaptık. get ile o metoda mainde ulastık.


}
