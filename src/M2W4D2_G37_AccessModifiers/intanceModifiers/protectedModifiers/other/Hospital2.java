package M2W4D2_G37_AccessModifiers.intanceModifiers.protectedModifiers.other;

import M2W4D2_G37_AccessModifiers.intanceModifiers.protectedModifiers.same.Doctor;

public class Hospital2 {
    public static void main(String[] args) {
        //protected olduğunda default gibi
        // diğer paketlerden kullanılamıyor.
        //Doctor Dr3=new Doctor();
  //protected old. için korudu ve ulaştırmadı..


        Doctor Dr2=new Doctor("Ayşe");
 // puplic olunca oldu..
  //      Dr2.print();// olmuyor. çünkü metod protected ile yazıldı.

    }
}
