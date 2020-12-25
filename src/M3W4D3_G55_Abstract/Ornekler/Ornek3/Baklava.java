package M3W4D3_G55_Abstract.Ornekler.Ornek3;

public class Baklava extends Sweet{



    // Food(abst)-->>Sweet(abst) (taste metodu) yapıldıgı için
// -->>Baklava ya geldiğinde madeIn i zorunlu tuttu.
//Çunku Food dan bu yana yapılmadı.Artık Class a gelince
//yapılmayan metodları zorunlu kılar.
    @Override
    public String madeIn() {
        return "Turkey";
    }
}
