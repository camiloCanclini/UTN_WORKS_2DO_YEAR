import java.util.*;

public class ejercicio7 {
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuacion Deberá Crear entradas en un Mapa");
        System.out.println("De la Forma --> ENTERO KEY : CADENA VALUE");
        System.out.println("Advertencia: No Puede Ingresar Keys Repetidas");
        do {
            System.out.print("Ingrese Entero -->");
            int key = sc.nextInt();
            System.out.print("Ingrese Una Cadena -->");
            String value = sc.next();
            sc.nextLine();
            map.put(key, value);
            System.out.println("Desea Seguir Ingresando Numeros? (Y/N)");
            char c = sc.next().charAt(0);
            sc.nextLine();
            if (c == 'N' || c == 'n')
                break;
        }while(true);
        System.out.println("El Mapa Ingresado Es El Siguiente:");
        System.out.println(map.toString());
        System.out.println(" Finalizando Programa ");
    }
}
