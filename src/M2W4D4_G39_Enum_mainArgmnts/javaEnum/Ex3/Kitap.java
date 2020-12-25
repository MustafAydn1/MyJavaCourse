package M2W4D4_G39_Enum_mainArgmnts.javaEnum.Ex3;

public class Kitap {
    String name;
    int basimYili;

    KitapKategori kategori;


    @Override
    public String toString() {
        return "Kitap{" +
                "name='" + name + '\'' +
                ", basimYili=" + basimYili +
                ", kategori=" + kategori +
                '}';
    }
}
