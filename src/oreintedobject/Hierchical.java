package oreintedobject;

public class Hierchical {

    int x;
    int y;
    void sub(){
        System.out.println(x-y);
    }
}

class Child3 extends  Hierchical{

    void sub(){
        System.out.println(x/y);
    }


}

class Child4 extends  Hierchical{
    void sub(){
        System.out.println(x*y);
    }


}