import java.util.*;

public class ejercicio8 {
    public static void main(String[] args){
        TreeMap<String, Integer> wordCounts = new TreeMap<String, Integer>();
        Integer count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Una Cadena --> ");
        String text = sc.nextLine();
        String[] words = text.split("\\s+");
        System.out.println(Arrays.toString(words));
        for (String word: words) {
            if (wordCounts.containsKey(word)){
                count = wordCounts.get(word);
                System.out.println("count: "+ count);
                wordCounts.put(word, count + 1);
            }else{
                wordCounts.put(word, count);
            }
            count = 1;
        }
        System.out.println(wordCounts.toString());
        System.out.println(" Finalizando Programa ");
    }
}
