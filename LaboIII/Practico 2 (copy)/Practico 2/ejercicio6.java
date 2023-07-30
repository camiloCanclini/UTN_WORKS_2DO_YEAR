import java.util.*;

public class ejercicio6 {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuacion Deberá Ingresar Numeros Enteros");
        System.out.println("Advertencia: Si Ingresa Numeros Repetidos, El Sistema No los Reconocerá");
        do {
            System.out.printf("Ingrese Entero -->");
            int num = sc.nextInt();
            set.add(num);
            System.out.println("Desea Seguir Ingresando Numeros? (Y/N)");
            char c = sc.next().charAt(0);
            sc.nextLine();
            if (c == 'N' || c == 'n')
                break;
        }while(true);
        System.out.println("El Conjunto Ingresado Es El Siguiente:");
        System.out.println(set.toString());
        System.out.println(" Finalizando Programa ");
    }
}
