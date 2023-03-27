package exercise26;

public class myClassA {
    private final String constant;

    public myClassA(String value){
        this.constant = value;
    }
    public void showConstant(){
        System.out.println("The Value of the Variable Is: " + constant);
    }
}
