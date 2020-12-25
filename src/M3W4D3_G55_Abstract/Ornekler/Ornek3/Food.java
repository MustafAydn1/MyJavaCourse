package M3W4D3_G55_Abstract.Ornekler.Ornek3;

public abstract class Food {

     private String name;



     public abstract String madeIn();
     public abstract String taste();

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     @Override
     public String toString() {
          return "{" +
                  "name='" + name + '\'' +
                  '}';
     }
}
