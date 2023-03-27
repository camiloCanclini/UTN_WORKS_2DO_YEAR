import java.util.Arrays;

public class exercise15 {
    public static void main(String[] args) {
        System.out.println("Los Argumentos Ingresados Son: " + Arrays.toString(args));
        System.out.println("Verificando Que los Argumentos Sean Números...");
        int arregloNumerico[] = new int[args.length];
        for (int i=0 ; i < args.length ; i++){
            try {
                arregloNumerico[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException error){
                System.out.println("Uno de los argumentos ingresados no es un número!");
                System.exit(1);
            }
        }
        System.out.println("Los Argumentos Son Números!");
        System.out.println("Ordenando...");
        Arrays.sort(args);
        System.out.println("Arreglo Ordenado: " + Arrays.toString(args));
    }
}