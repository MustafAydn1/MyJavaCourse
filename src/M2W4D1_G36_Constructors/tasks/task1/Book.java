package M2W4D1_G36_Constructors.tasks.task1;

public class Book {
    String name;
    int publishYear;
    String autor;

    public  Book(String name,int publishYear,String autor){

        this.name=name;
        this.publishYear=publishYear;
        this.autor=autor;

// burada hepsini ister ve hepsini yazdırır...tek satır olamaz
    }
    public  Book(String name,int publishYear){

        this(name,publishYear,"");// bunun içinide boşltırsan(silesen)
        //book2 nın bilgilerini yazsanda cıktıya boş olarak verir.
    }

    public Book(String name){
        this(name,0,"");
    }

    public Book(){
        this("",0,"");
    }

//toString Metodu deniyor. ister elle yap...
    public  String toString1(){
        return name+" "+publishYear+" "+autor;
    }

//toString istersen otomatik yapsın. daha duzenli...
// ikisini de yaparsan toString yazan calişır.
//önune toString1 filan eklersen calışmaz.

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", autor='" + autor + '\'' +
                '}';
    }

    public  void ShowInfo(){
        System.out.println(name+" "+publishYear+" "+autor);

    }
}
