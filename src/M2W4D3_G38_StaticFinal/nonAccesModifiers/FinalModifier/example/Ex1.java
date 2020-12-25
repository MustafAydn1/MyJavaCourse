package M2W4D3_G38_StaticFinal.nonAccesModifiers.FinalModifier.example;

public class Ex1 {
    public static void main(String[] args) {
    // dairenin alanı pi*r*r dir.

      int yaricap=4;

      double Alan=4*4*Constants.pi;

      int gun=23;
      int saat=7;
      int dakika=25;

      int saniyeCinsinden=(gun*Constants.hourInDay*Constants.minuteHour*Constants.secondMinute)+
                          (saat*Constants.minuteHour*Constants.secondMinute)+
                          (dakika*Constants.secondMinute);


        System.out.println("saniyeCinsinden = " + saniyeCinsinden);


}
}