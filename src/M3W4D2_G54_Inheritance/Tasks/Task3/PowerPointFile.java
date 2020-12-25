package M3W4D2_G54_Inheritance.Tasks.Task3;

public class PowerPointFile implements ReadFile{
    @Override
    public String open() {
        return "clas tan class a  extends  olur...";
    }

    @Override
    public String read() {
        return "interface den class a implement olur. ";
    }

    @Override
    public String save() {
        return "interface den interface e  extends olur. ";
    }

    @Override
    public String close() {
        return "implement yazdıktan sonra aralarına virgul atarak interface adları ile birden çok implement  yapabilirsin.";
    }
}
