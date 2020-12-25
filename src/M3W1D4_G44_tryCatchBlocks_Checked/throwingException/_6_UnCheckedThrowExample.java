package M3W1D4_G44_tryCatchBlocks_Checked.throwingException;

import java.util.Scanner;

public class _6_UnCheckedThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz=");
        String username=oku.nextLine();

        if (username.length() < 6)
            System.out.println("Kullanıcı adı 6 karakterden az olamaz");

        if (username.length() > 10)
            System.out.println("Kullanıcı adı 10 karakterden büyük olamaz.");




    }
}
