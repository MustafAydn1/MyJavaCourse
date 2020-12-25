package M3W4D1_G53_Interfaces.Ornekler.Ornek3;

public class A4 implements  IYazdirilabilir,IGosterilebilir{
    @Override
    public void yaz() {
        System.out.println("Yazılıyor...");

    }

    @Override
    public void goster() {
        System.out.println("Gösteriliyor...");

    }
}

// class A4 implements,IYazdırılabilir,IGosterilebilir  ::::
// bir class birden cok interface i imlement ederken böylece yazılır.