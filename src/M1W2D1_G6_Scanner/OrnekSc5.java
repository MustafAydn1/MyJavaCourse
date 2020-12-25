package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class OrnekSc5 {
    public static void main(String[] args) {
        // Kullanıcıdan kaç bilet istediğini(byte) ve sigorta isteyip istemedğini (boolean olarak)
        // alıp ekrana yazdırınız.

        Scanner input =new Scanner(System.in);

        System.out.print("Kaç Bilet İstersiniz= ");
        int bilet= input.nextInt();

        System.out.print("Sigorta İster misiniz= ");
        boolean sigorta = input.nextBoolean();

        System.out.println( "Bilet Sayınız=" + bilet + "\n" +"Sigort Durumu= " + sigorta);





    }
}
