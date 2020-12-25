package M4W1D5_G62_OCA.p2;


import M4W1D5_G62_OCA.p1.Acc;

public class Test extends Acc {
        public static void main(String[] args) {
            Acc obj = new Test();
            // obj.s // sadec public olana ulaşabildik protected a ulaşamadık çünkü referansı child class referansı değildi.

            // Alttaki gibi child class referans olduğunda protected a ulaşılabilid.
            Test obj2 = new Test();
            //obj2.r
            //obj2.s
        }
    }

