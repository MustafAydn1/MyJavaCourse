package M2W4D1_G36_Constructors.tasks.task2;

public class Banka {

    String name;
    int hesapNo;
    String subeAdi;

// boşluga  sag tuş,Generate---> Constructor.... secerek yap...
// en geniş halini al diğerlerini elle yazsan daha kısa gibi...

    public Banka(String name, int hesapNo, String subeAdi) {
        this.name = name;
        this.hesapNo = hesapNo;
        this.subeAdi = subeAdi;
    }

    public  Banka(String name, int hesapNo){

        this(name, hesapNo, "");
    }

    public  Banka(String name){

        this(name,0,"");
    }

  /*  public String toString(){

        return name+" "+hesapNo+" "+subeAdi;
    }
*/

// boşluga  sag tuş,Generate---> toString yap...
    @Override
    public String toString() {
        return "Banka{" +
                "name='" + name + '\'' +
                ", hesapNo=" + hesapNo +
                ", subeAdi='" + subeAdi + '\'' +
                '}';


    }
}
