package M1W1D5_G5_TypeCasting_2;

public class örnek11 {
    public static void main(String[] args) {

        // string olarak verilen gece gunduz sıcaklıgı bilgisini toplamını yazdırınız

        String Gece= "15";
        String Gündüz="30";

        int karanlık =Integer.parseInt(Gece);
        int aydınlık= Integer.parseInt(Gündüz);

        int toplamderece = karanlık+aydınlık;

        System.out.println("toplam derece = " + toplamderece);







    }
}
