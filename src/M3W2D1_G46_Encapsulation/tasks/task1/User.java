package M3W2D1_G46_Encapsulation.tasks.task1;

import java.util.ArrayList;
/*
    // 1- filedları id, username, password, active (boolean), signedIn (boolean)
    //    olan User isimli bir class tanımlayınız.
    // 2- bütün fieldları parametre alan bir concructor tanımlayınız.
    // 3- bütün fieldları için getter ve setter metodları oluşturunuz.
    // 4- UserMain isminde main için bir class oluşturunuz.
    // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
    //    active ve signedIn default olarak true, false atayabilirsiniz.
    //    id yi sistem otomatik versin.,
    // 6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
    //    6 karakterden küçük olup olmadığını (classın içinde) kontrol ediniz.
 */
public class User {

    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedId;

   // private ArrayList<User> users=new User(); burada 43opyapamadım. set ve geti aşagıda...

    private  static int sayac=1;   // static olarak bir sayac belirlediğimize dikkat et.

//id yi kullanıcıdan almayıp kendimiz verecez.bu yuzden consructor daki parametrelerden sil.
//boolean active;  ve   signedId; kullanıcıdan almayıp kendimiz verecez
// active daima true dur. signedId ise false dir. default olarak da.




    public User(String username, String password) {
        //   this.id = sayac++; // buna gerek yok direk metodu buraya cagır.
        setId();
        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedId(false);
//this. ları  set metodlarını cagırma olarak degiştirelim.
// burasından dolayı enkapsuleyşin zaten..
    }



    public int getId() {
        return id;
    }

    public void setId() {// burada parametre int i sildik. cunku sayac la atayacagız.
        // parametre olmadıgından da sayac gibi birseye eşitleyecez.
      // this id=id;

        this.id = sayac++;// sayacın o anki değeri atanır,++ lar sağda olduğu için sonrasında değeri 1 artar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        if(password.length()<6)
           throw new RuntimeException("Passwordu 6 karakterden büyük giriniz");

        this.password = password;
    }

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedId() {
        return signedId;
    }

    public void setSignedId(boolean signedId) {
        this.signedId = signedId;
    }

    // boolean ları isActive olarak get yaptıgına dikkat et.

   /* public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
*/
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedId=" + signedId +
                '}';
    }
}
