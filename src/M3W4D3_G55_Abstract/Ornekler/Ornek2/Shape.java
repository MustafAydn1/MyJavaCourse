package M3W4D3_G55_Abstract.Ornekler.Ornek2;

public abstract class Shape {
    private String name;


// bu boş const. incele...
    public Shape() {
        System.out.println("BURADA OLUŞTURDUGUN boş const. ı " +
                "extendslerde de oluşturursan main nesneyı " +
                "buna göre oluşturabilirsin...YOKSA mainde oluşmuyor.");
    }


    public Shape(String name) {
        this.name = name;
    }
/* bu constructor sayesinde extends lerin
yani dikdörtgen ve karenin isimleri
otomatık olarak yazılacak,heryerde kullanılacak.
toString de--ciz de vb. hep buradan extends
olarak cekecek. getname ler ismi böyle alıyor
boş constructor da oluşturursan extradan
nesne olustururken bilgi girmeden de obje
oluşturursun.
 */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String ciz(){
        return getName() + " i çiziniz.";
    }

    public abstract double Area();
    public abstract double Perimeter();

    @Override
    public String toString() {
        return "{" +
                "ismi='" + name + '\'' +
                " Area='" + Math.round(Area()) + '\'' +
                " Perimeter='" + Perimeter() + '\'' +
                '}';
    }




    public String toString2() {
        String formatliCevre=String.format("%-10.2f", Perimeter());
//. dahil 10 hane yazar. noktadan sonra 2 hane yazar. saga dayalıydı.
//başına - koyarak sola dayadık.

        return "{" +
                "ismi='" + name + '\'' +
                " Area='" + Math.round(Area()) + '\'' +
                " Primeter='" + formatliCevre + '\'' +
                '}';




    }
}
