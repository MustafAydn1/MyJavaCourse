package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class Nestedif1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Rate please= ");
        int rating=input.nextInt();

       /* if(rating>=0 && rating<=5){

            if(rating<=2){
                System.out.println("What's the reason for your low rating?");
            }

            System.out.println("Thank you for your feedback.");

        }
*/
        if(rating>=0 && rating<=5)  System.out.println("Thank you for your feedback.");

        if(rating<=2)
            System.out.println("What's the reason for your low rating?");


// Nestedif ile aynı sayılır. yazıların sırası değişti. Bunu tam anlamadım. niçin kullanırız...
        //tek örnekle elbette acıklanamaz. ama nerelerde niçin kullanırız.








    }
}
