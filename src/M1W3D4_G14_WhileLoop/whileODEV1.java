package M1W3D4_G14_WhileLoop;

public class whileODEV1 {
    public static void main(String[] args) {


        int maaş = 2000;
        int yıl=0;

        while(yıl<5){

            int zam=(maaş*15/100);
           maaş=zam+maaş;

            yıl++;

        }
        System.out.println(maaş);

















    }


}
