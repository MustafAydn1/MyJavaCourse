package M4W1D5_G62_OCA;

public class S141 {
}

class Employee{
    String name;
    boolean contract;
    double salary;

    Employee(){
        //this("joe", true, 100); buranın çalışacağı bir consructor yok

        this.name=new String("joe");
        this.contract=new Boolean(true); // böyle tanımlamalarda olur....
        this.salary=new Double(100);
        // line n1

        //Integer aa=new Integer(5);  burada , aa Integer nesnesi oluyor. bu hata vermiyor...
    }

    public String toString(){
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="Joe";
        e.contract=true;
        e.salary =100;

        //this.name bu şekilde kullanılamaz.

        // line n2

        System.out.println(e);
    }

}

