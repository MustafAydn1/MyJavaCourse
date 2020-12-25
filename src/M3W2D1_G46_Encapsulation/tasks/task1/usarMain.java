package M3W2D1_G46_Encapsulation.tasks.task1;

import java.util.ArrayList;
import java.util.Scanner;
// 1- filedları id, username, password, active (boolean), signedIn (boolean)
//    olan User isimli bir class tanımlayınız.
// 2- bütün fieldları parametre alan bir concructor tanımlayınız.
// 3- bütün fieldları için getter ve setter metodları oluşturunuz.
// 4- UserMain isminde main için bir class oluşturunuz.
// 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
//    active ve signedIn default olarak true ve false atayabilirsiniz.
//    id yi sistem otomatik versin.,
// 6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
//    6 karakterden küçük olup olmadığını (classın içinde) kontrol ediniz.

// 7. Adım, sadece passwordu istesin nasıl yapardınız
public class usarMain {
    public static void main(String[] args) {


        String username="";
        String password="";
        boolean usernameIste=true;
        int miktar=0; // 1 den başlatsaydık.miktar+1 degil,miktar yazardık.
        Scanner input= new Scanner(System.in);
        ArrayList<User>users=new ArrayList<>();

// eger sayac sonda ise do-while olmalı dedi.
// ne kadar girecegimizi bilemediğim için while kullan.
      do{

          if(usernameIste) {//bu bölümün çalışıp çalışmamasına boolean type karar vercek.
//true ise calıscak(girecek),false ise bu bölüme girmeden aşagıya inecek.
              System.out.print(miktar + 1 + ". Username= "); // miktar+1 ile sayıyı otomatik ata.
              username = input.nextLine();

          }
          System.out.print("password= ");
          password=input.nextLine();
// burada username ve password u tanımlamazsan aşagıdaki nesne kızarır.
//çünkü kullanıcı bilgileri buradan giriyor..

// hatayı nerede verdi ise trycatch i oraya kurmam lazım ki yakalasın.
// user bilgileri girerken oluyor. o zamna oraya kurmalısın.

          try {

              User yeniUser = new User(username, password);
              miktar++;
/*Eger hata varsa catch te usernameIste=false olur.yukarı cıkar ifin içi de false olur.girmez.
password dogru olunca da catch girmez.Ama enson döngüde catch den gelen false oldugu için de
username istemeden, surekli passwoord ister.döngude hata yoksa if in içi tekrar true olsun diye
try ın sonuna(hata yoksa gelir.) true eklenır. böylece artık username e girer.
 */
           usernameIste=true;// hata olmadıgında bir sonraki kullanıcı için username istenecek

//ArrayList i herşeyin dogru gittiği yerde oluşturacaksınız.yani try sonunda


              users.add(yeniUser);


          }

          catch(Exception ex){
              System.out.println(ex.getMessage());

//username tekrar istemesin,sadece paswordu istesin.
//hata nerede olusuyorsa oraya username isteme deriz.
//hata catch in içinde oluşur.demek ki buraya koyacaz.
//böylece hata oluşunca username istenmez.
//ama sadece buraya koyarsam,sonraki user ın adınıda istemez.
//hep sadece password ister.demekki bişey daha yapmam lazım.

              usernameIste=false;// hata oldugunda tekrar username isteme.
          }

      }while (miktar<3); // 2 tane yeniuser alacagımız için 2 yaptık.

// mıktar++ , catch ile while arasındaydı.yanlış yapınca biterdi
//ama biz döngunun devam etmesini istiyoruz. bu yüzden.
//try daki ifadenin hemen altına yazdık. ÇÜNKÜ;
//ifade yanlışsa alta inmez.dogru girinceye kadar da döngü surer.
//çünkü, miktar yanlış girdiginde artmayacak,hata ile break olacak.


        System.out.println(users);

    }


/*

Arraylist e ekleyip yazdırınca password hatalı da olsa id artıyor.
bunu aşmak için: hatalı ise yeni user oluşturmadan güncelleme yap.
yeni ise yeni oluştur. yeniuser kısmına if koyacan.

 */

}
