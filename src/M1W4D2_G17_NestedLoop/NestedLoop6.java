package M1W4D2_G17_NestedLoop;

public class NestedLoop6 {
    public static void main(String[] args) {
        //     *
        //    **
        //   ***
        //  ****
        // *****


        for(int satır=1; satır<=5; satır++)  //satır kontrolu
        {
           for(int boşluk=5-satır; boşluk>0; boşluk--) // boşluk kontrolu
           {
               System.out.print(" ");
           }

            for(int sutun=1; sutun<=satır; sutun++){ // sutun kontrolu

                System.out.print("*");
            }
            System.out.println();
        }
// satır--sutun--boşluk tamammen birbiri ile alakalı...bu ilgiyi önce sözlü sonra matemetiksel olarak ifade et.



    }
}
