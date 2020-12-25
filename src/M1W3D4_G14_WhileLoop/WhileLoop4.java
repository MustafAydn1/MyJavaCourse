package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi=input.nextInt();



        while (sayi>0) {


            sayi--;

            if ((sayi % 2) == 1) {
                System.out.println("tekleri= " + sayi);
            }
            if(sayi%2==0) System.out.println("çiftleri= "+sayi);





// sayıyı if in altına yazarsan dahil eder .. ÜSTÜNE YAZARSAN DAHİL ETMEZ... if in parantezini ister koy. ister koyma
// eger if e parantez koyarsan sonlandırma ifadesini if in parantezinin içine koyma... dönguye girmiyor. dene??
        }

    }
}
