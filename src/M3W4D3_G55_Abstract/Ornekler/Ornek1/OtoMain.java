package M3W4D3_G55_Abstract.Ornekler.Ornek1;

public class OtoMain {
    public static void main(String[] args) {

        Ford ford1=new Ford();

         ford1.setUretimYili(2020); // bu kısmı tam anlayamadım

        System.out.println(ford1.getMarka());
       // ford1.getUretimYili(); // sadece bunu yazarsan 1 tane yazar
      System.out.println(ford1.getUretimYili());// 0 verdi.
        //çünkü setUretimYili yapılmadıgı için. bunu
        // BinekOto veya Ford da yapabilirsin
//BinekOto ya yapınca Ford extends oldugu için
//setUretimYili ni direk aldı.
//metod cagırılıp deger girince getUretimYili direk yazdı.
    }
}


// getUretimYılını alabilmem için SetUretim yılı oluşturup,degr girip,
// bunu get ile almam lazım. set metodu bunun için elzem.
// ford1.setUretimYili(2020);  bu kısmı yoruma alınca veya
//Binek orodan set kısmını silince daha net farkedersin.