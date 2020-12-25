package M2W4D2_G37_AccessModifiers.intanceModifiers.publicModifiers.same;

public class SearchEngine {
    public String name;

    // Consructors olusturduk... Alt insert..??? kısa yolu anlamadım

    public SearchEngine(String name) {
        this.name = name;
    }

  //toString olusturduk
  public String toString() {
        return "SearchEngine{" +
                "name='" + name + '\'' +
                '}';
    }
 /*
 public String toString() {
burada public silinince kendisi kızarıyor...
 toString metodu basında public olmadan olmuyor mu.?
 O L M U Y O R....  !!!!!!!!!!!
  */


}
