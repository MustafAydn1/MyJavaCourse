package M2W4D2_G37_AccessModifiers.intanceModifiers.protectedModifiers.same;

public class Doctor {
   protected String ad;

    protected Doctor(){
    }

    public Doctor(String ad) {
        this.ad = ad;
    }

    protected void print(){

        System.out.println("ad = " + ad);
    }


}
