package M4W1D5_G62_OCA;

public class S103 {
}
class Student {

    String name;


    public Student(String name) {

        this.name = name;


    }

}

 class Test {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[1] = new Student("Richard"); // farklı bir dizi yazımı daha..
        students[2] = new Student("Donald");



        for (Student s : students) {
            System.out.println("" + s.name);
        }
    }
}
