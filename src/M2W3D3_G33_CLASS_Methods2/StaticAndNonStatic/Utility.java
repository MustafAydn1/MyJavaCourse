package M2W3D3_G33_CLASS_Methods2.StaticAndNonStatic;

public class Utility {// Utility= Yararlı-faydalı-işlevsel manasına... helpfull--usefull...ADINI BİZ KOYDUK.
/*
    public  String getString(int value){

        return String.valueOf(value);
    }
    public int getInt(String value)
   {
       return Integer.parseInt(value);
   }

    public Double getDouble(String value){
        return Double.parseDouble(value);
    }

    public boolean getBool (String value){
        return Boolean.parseBoolean(value);
    }
*/
    //3. yöntem static ekledik
    public static String getString(int value){

        return String.valueOf(value);
    }
    public static int getInt(String value)
    {

        return Integer.parseInt(value);
    }

    public static Double getDouble(String value){

        return Double.parseDouble(value);
    }

    public static boolean getBool (String value){

        return Boolean.parseBoolean(value);
    }
}
