package M2W3D2_G32_CLASS_Methods.tasks.task2;

public class ElectricityAccount {
    int totalKw=0;      // BURADA BAŞLANGIC DEGERİ VERİLEBİLİR...
    double rate=0.7;    //ama static se dikkat et..Sayaca dönüşebilir.!!!!
    double bill;

   void tuketimEkle(int tuketim){

       totalKw+=tuketim;

    }

    double totalbill(){

     bill=totalKw*rate;

       return bill;
    }
}
