package oreintedobject;

public class EncapsulationExec {
    public static void main(String[] args) {
        Encapsulation student = new Encapsulation();
        student.setLastName("sadoun");
         student.setName("menad");
        String name= student.getName();
         String lastname =student.getLastName();
        System.out.println( name+","+lastname );
    }

}
