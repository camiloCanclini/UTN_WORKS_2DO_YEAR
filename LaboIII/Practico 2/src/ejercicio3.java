import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> integers = new HashSet<>();
        do{
            System.out.println("Ingrese un Entero");
            int word = sc.nextInt();
            integers.add(word);
            System.out.println("Desea seguir ingresando Strings? (Y/N)");
            char c = sc.next().charAt(0);
            sc.nextLine();
            if (c != 'Y' && c != 'y')
                break;
        }while(true);

        System.out.println("Colleccion Ingresada");
        System.out.println(integers);
        System.out.println("Ingrese Valor a buscar: ");
        int input = sc.nextInt();
        System.out.println("El valor existe? " + integers.contains(input));
        System.out.println("Finalizando Programa...");
    }
}
