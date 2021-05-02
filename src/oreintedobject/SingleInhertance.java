package oreintedobject;

public class SingleInhertance {
    int x;
    int y;
    void sum(){
        System.out.println(x+y);
    }
}

class Child extends SingleInhertance{
    int z;
     void sum(){
          super.sum();
         System.out.println(x-y);
     }

     void sum (int x, int y , int z){
         this.x=x;
         this.y=y;
         this.z=z;
         System.out.println(x+y+z);

     }


}