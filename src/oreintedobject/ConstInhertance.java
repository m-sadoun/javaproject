package oreintedobject;

public class ConstInhertance {
    int x;
    int y;
    ConstInhertance(int x, int y){
        this.x=x;
        this.x=y;


    }

    void div(){
        System.out.println(x/y);
    }

}
class math extends ConstInhertance{

    math(int x, int y) {
        super(x, y);
    }
    void div(){
        System.out.println(x-y);
    }

}

