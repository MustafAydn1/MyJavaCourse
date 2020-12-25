package M3W4D4_G56_Ornekler.Ornek1;


class  C{
    C(){
       System.out.println("C");
    } // aynı class icinde old. için metoda public yazılmasa da olur, yazılsa da..
}

class B extends C{
    B(){
        System.out.println("B");
    }
}

class  A extends B{

    public A(){ // burada public e de gerek yok.
        System.out.println("A");
    }
}

public class Ornek1 {
    public static void main(String[] args) {//main neden statictir.? nesnesiz calişması için
        A a=new A();                      // calışabiliyor.calışıyor olması için. new ile oluşturmamak için? sebebleri...??
    }
}
