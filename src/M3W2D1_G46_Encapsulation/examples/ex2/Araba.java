package M3W2D1_G46_Encapsulation.examples.ex2;

public class Araba {

    private String renk;
    private String model;
    private int motor;
    private int kapiSayisi;


// boş constrotor bentley  nesnesi içindi.
    public Araba(){

    }

    // burada ise tamamı dolu constructor oluştu.sonra thisler setlere dönuşturduk
    public Araba(String renk, String model, int motor, int kapiSayisi) {
       setRenk(renk);
       setModel(model);
       setMotor(motor);
       setKapiSayisi(kapiSayisi);

       // bu kısım daki  this.renk=renk;  kısmını... setRenk(renk); yapılacak
        // zaten buna enkapsuleyşin deniyor.
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if(kapiSayisi==2 || kapiSayisi==4)  this.kapiSayisi=kapiSayisi;
        else    System.out.println("KAPI SAYISI 2 VEYE 4 OLABİLİR");

// kapı bilgisini yanlış girmesinler diye set metodunda çalıştık.

    }
/*
    public Araba(String renk,String model,int motor,int kapiSayisi){
 // bunu yaptıgın anda  bentley kızardı. çunku içine bilgi istiyor.
 //bunu aşmak için boş Contructor yapmamız lazım.
        this.renk=renk;
        this.motor=motor;
        this.model=model;
        this.kapiSayisi=kapiSayisi;

  */
  // constructor ile otomatik yapardın... ama getter--setter ile yapmalısın...



}






