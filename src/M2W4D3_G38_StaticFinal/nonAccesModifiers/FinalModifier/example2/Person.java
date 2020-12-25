package M2W4D3_G38_StaticFinal.nonAccesModifiers.FinalModifier.example2;

public class Person {
    String name;
    final int fingerprintCode;

 // finale deger atamayınca constructor yazmadan önce kızardi.
//yazınca razı oldu.senet almış gibi.garantiye aldı.

    // final değişkenlerine ilk değer atama işlemi direk
    // yapılabildiği gibi constructorla da atanabilir.
    // ancak daha sonra yine değeri değiştirilemez.
    // bu işlem ilk değer atama için geçerli.
// bu sadece Contructor da yapılabiliyor. başka yolu yok.



    public Person(String name, int fingerprintCode) {
        this.name = name;
        this.fingerprintCode = fingerprintCode;



    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fingerprintCode=" + fingerprintCode +
                '}';
    }

}
