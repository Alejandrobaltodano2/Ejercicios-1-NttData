package Ejercicio_1;
import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones a = new Operaciones();

        System.out.println("Ingrese la x ");
        a.setX(scanner.nextDouble());
        boolean Salir =false;
        do {
            System.out.println("Ingrese la y ");
            int validacion = a.setY(scanner.nextDouble());
            if(validacion ==0) Salir = true ;
        }while (Salir ==false);

        System.out.println("La suma es : "+a.suma());
        System.out.println("La resta es : "+a.resta());
        System.out.println("La Multiplicacion es : "+a.multiplicacion());
        System.out.println("La Division es : "+a.division());
        System.out.println("El valor es "+ Operaciones.isPar(a.division()));
        System.out.println("El Sumatorioa es "+ Operaciones.sumatoria(1,5));
    }
}