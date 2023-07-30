import java.util.*;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> collection = new ArrayList<>();
        do{
            System.out.println("Ingrese un String");
            String word = sc.nextLine();
            collection.add(word);
            System.out.println("Desea seguir ingresando Strings? (Y/N)");
            char c = sc.next().charAt(0);
            sc.nextLine();
            if (c != 'Y' && c != 'y')
                break;
        }while(true);
        System.out.println("Colleccion Ingresada");
        System.out.println(collection);
        System.out.println("Ordenando: ");
        Collections.sort(collection);
        System.out.println(collection);
        System.out.println("Finalizando Programa...");
    }
}
