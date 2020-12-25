package M3W4D4_G56_Ornekler.Ornek2;

import java.time.LocalDate;

public abstract class Hayvan {

    static  int sayac=0;

    private String name;
    private Boolean vahsi;
    private LocalDate dob;
    private int id;



    public abstract void yiyecegi();
    public  abstract void yemeMiktari();
    public abstract void gunlukUykuSuresi();
    public  abstract void sesi();

    public Hayvan() {
       sayac++;
        setId();
    }
//kedi-kartal olustugunda da bu  const. calışıyor.
//her hayvan olustugunda sayac 1 artacak.
//mainde her new oluştugunda const. calışacak ve
//sayac artacak.
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = sayac;

    }
//setId yı de sayac a eşitleyince parametresini sildik.
//cunku gerek kalmadı.mainde de setId nin içine bişey yazmaya
//gerek kalmadı.olması yeterli oldu.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVahsi() {
        return vahsi;
    }

    public void setVahsi(Boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }



    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vahsi=" + vahsi +
                ", dob=" + dob +
                '}';
    }
}
