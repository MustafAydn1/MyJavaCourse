package M4W1D5_G62_OCA;

// Extend işleminde subClass(child) da , super(parent) class daki access modifiers lar GENİŞLETİLEBİLİR
// fakat DARALTILAMAZLAR.
//  public -> protected -> default ->  private  (genişten -> dar a doğru)

public class S101 {

    //super class
    abstract class Planet {
        protected void revolve(){ }
        abstract void rotate();
    }

    //sub class
    class Earth extends Planet {
        public void revolve(){ // burası private idi...
        }

        public void rotate(){ // burası private idi...
        }
    }




}

