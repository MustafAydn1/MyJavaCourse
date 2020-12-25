package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class ifelseif1_İNCELE {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.
       // Buradaki sorun fizik: 90 string ile yazılma zorunda. 90 kısmını int. e çevirip işlemleri yap.

        Scanner input= new Scanner(System.in);
        System.out.print("Dersiniz ve Notunuz: ");
        String DersNotu= input.nextLine();


       int Not=Integer.parseInt(DersNotu.substring(DersNotu.indexOf(" ")+1));
//  int ogrNot = Integer.parseInt(dersNot.replaceAll("[^0-9]", ""));  BUNU DA ÖĞREN. NEDİR BU??

  /*   if(Not>=90) System.out.println('A');
       if(Not<90 && Not>=80) System.out.println('B');
       if(Not<80 && Not>=70) System.out.println('C');
      // if(Not>=60) System.out.println('D');
       //if(Not>=40) System.out.println('E');
       //if(Not<40) System.out.println('F');
       //BÖYLE YAPARSAM: 63 GİRSEM,  D  ve E OLARAK YAZAR... yada üst kısım gibi && lar ile kısıtlamam lazım.
       // BUNUN YERİNE else if kullanarak, yukarıdan aşagıya kontrol ederek inerim.şart sağlanınca durur...
*/

        if(Not>=90) System.out.println('A');
        else if( Not>=80) System.out.println('B');
        else if( Not>=70) System.out.println('C');
        else if(Not>=60) System.out.println('D');
        else if(Not>=40) System.out.println('E');
   //     else  if(Not<40) System.out.println('F');yazmaya gerek yok.yukarıdakıler dışında bir durum oldugu için.
        // daima sağlanan durum olacaktır. ''always true''. bu yuzden else yazıp, ŞART KOYMAMALIYIZ!!!
        else   System.out.println('F');








    }
}
