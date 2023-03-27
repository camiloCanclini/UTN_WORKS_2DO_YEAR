package exercise24;
public class main{
    public static void main(String args[]){
        myClassA myObj = new myClassA("VALUE1");
        String value = myObj.getValue();
        System.out.println("The Value of the Object: " + value);
        System.out.println("Changing Value Of the Object...");
        myObj.setValue("VALUE2");
        String newValue = myObj.getValue();
        System.out.println("The Value of the Object: " + newValue);
    }
}