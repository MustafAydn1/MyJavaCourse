package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("gunNo =");
        int gunNo= oku.nextInt();

        switch (gunNo) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            case 3 -> System.out.println("Çarşamba");
            case 4 -> System.out.println("Perşembe");
// gunNo 5 eşit ise
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("Hatalı gün no");
        }







    }
}
