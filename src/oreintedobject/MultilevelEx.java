package oreintedobject;

public class MultilevelEx {
    public static void main(String[] args) {
        MultilevelInhertance m =new MultilevelInhertance();
        m.x =10;
        m.y=30;
        m.mul();
        System.out.println("---------the result for child 1------");
 Child1 c= new Child1();
  c.x=10;
  c.y=20;
  c.z=10;
  c.mul();
  c.mul(10,20,30);
        System.out.println("--------the rsult for child2----------");
        Child2 c2 = new Child2();
        c2.x=10;
        c2.y=20;
        c2.mul();
        c2.mul(10,23,21);
        c2.mul(12,12,13,45);



    }
}
