package M2W3D2_G32_CLASS_Methods.tasks.task1;

public class Rectangle {//rektengıl: dikdötrgen

    int width;
    int length;

    int getPerimeter(){// çevre // burada ne public --- nede static yazmadık.  Nasıl oldu????????????  DEFAULT=PACKAGE PRİVATE
    //   int cevre= 2*(width+length);
        return 2*(width+length);
    }

    int getArea(){ // alan--burada ne public --- nede static yazmadık. . Nasıl oldu????????????*****    DEFAULT=PACKAGE PRİVATE

        return (width*length);
    }
}
