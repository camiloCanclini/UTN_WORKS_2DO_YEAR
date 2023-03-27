package exercise23;

public class myClassA {
    private int[] values;
    public myClassA(int... args){
        this.values = args;
    }

    public void showCalc(){
        int calc = 0;
        for (int value : values) {
            calc += value;
        }
        System.out.println(calc);
    }
}
