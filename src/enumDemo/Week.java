package enumDemo;

public class Week {
    private Days days;
    public  Week(Days days){
        this.days=days;
    }

    public void whatTodo(){
        switch(days){
            case  friday:
                System.out.println("i'll paly soccer");
                break;
            case  saturday:
                System.out.println("i'll paly cricket");
                break;
            case  sunday:
                System.out.println("i'll paly guitar");
                break;

            default:
                System.out.println("i will go work");



        }
    }

}
