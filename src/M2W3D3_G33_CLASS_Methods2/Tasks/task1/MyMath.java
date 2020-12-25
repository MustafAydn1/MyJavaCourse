package M2W3D3_G33_CLASS_Methods2.Tasks.task1;

public class MyMath {



    public  static int mutlakDeger(int a){

        return Math.abs(a);
    }
    public  static  int enBuyuk (int a,int b){

        return Math.max(a,b);
    }
    public static double karekok(int a){
        return Math.sqrt(a);
    }
    public static int rasgeleSayilar(int max,int min){

        return (int)(Math.random()*(max-min+1))+min;
    }
}
