import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Stack;


public class exercise16 {
    public static void main(String[] args) {
        System.out.println("The Input Argument Is: " + Arrays.toString(args));
        System.out.println("Verifing If There Is One Argument...");
        if (args.length > 1){
            System.out.println("ERROR: There is More Than One Argument!");
            System.exit(1);
        }if (args.length == 0){
            System.out.println("ERROR: There is Not Argument!");
            System.exit(1);
        }
        System.out.println("Verifing If The Argument Is a Number...");
        try {
            int numericArgument = Integer.parseInt(args[0]);
        } catch (NumberFormatException error){
            System.out.println("ERROR: The Argument Is Not a Number");
            System.exit(1);
        }
        System.out.println("Everything Is Okey!");
        String binaryNumber = "";
        boolean numberIsNegative = false;
        int number = Integer.parseInt(args[0]);
        int originalNumber = number;
        System.out.println("Parsing Argument To Binary Format...");
        if (number == 0){
            binaryNumber = "0";
            System.exit(1);
        }
        if (number < 0){
            System.out.println("The Number Is Negative, Using Two's Complement...");
            numberIsNegative = true;
            number = number + -number*2;
        }
        while(number!=0){
            if (!numberIsNegative) {
                if (number%2==0){
                    binaryNumber = "0 "+binaryNumber;
                }else{
                    binaryNumber = "1 "+binaryNumber;
                }
            }else{
                if (number%2==0){
                    binaryNumber = "1 "+binaryNumber;
                }else{
                    binaryNumber = "0 "+binaryNumber;
                }
            }

            number = number/2;
            //System.out.println(number);
        }
        System.out.println("Converting: " + originalNumber + " --> " + binaryNumber);
    }
}
