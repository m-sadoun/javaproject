package oreintedobject;

public class MultilevelInhertance {

    int x;
    int y;

    void mul(){
        System.out.println(x*y);
    }

}

class Child1 extends  MultilevelInhertance{
    int z;

    void mul(){
        super.mul();

        System.out.println(x/y);
    }

    void mul(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
        System.out.println(x+y/z);

    }

}

class Child2 extends Child1{
    int w;

    void mul(){
        super.mul();

        System.out.println(x+y);
    }
    void mul( int x, int y, int z)
    {
        super.mul();
        this.x=x;
        this.y=y;
        this.z=z;

        System.out.println(x/y/z);

    }
    void mul(int x, int y, int z, int w){
        this.x=x;
        this.y=y;
        this.z=z;
        this.w=w;


        System.out.println(x+y*-z+w);
    }





}
