package practice7.lib;

public class Week {

    Days days;

    public Week(Days days){
        this.days=days;
    }

    public void whatToDo(){

        switch (days){
            case Friday:
                System.out.println("stay home and chill");
                break;
            case Saturday:
            case Sunday:
                System.out.println("join class at PNT");
                break;
            case Monday:
                System.out.println("go back to work");
                break;
            default:
                System.out.println("practice java");

        }
    }
}
