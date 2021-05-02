package oreintedobject;

public  abstract class Animal {
     abstract void animalSound();
     void animalEat(){
         System.out.println("animal is eating");

     }

}
class Cut extends  Animal{
    void animalSound(){
        System.out.println(" the sound of cut is maw maw");

    }
    void animalEat(){
        System.out.println(" cut  is eating");

    }
}

class  Dog extends Animal{
    void animalSound(){
        System.out.println(" the sound of dog  is haw haw");

    }
    void animalEat(){
        System.out.println(" dog  is eating");

    }

}
