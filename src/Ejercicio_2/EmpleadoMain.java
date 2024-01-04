package Ejercicio_2;


import java.util.Scanner;

public class EmpleadoMain {

    public static void main(String[] args) {
        Empleado empleado = setEmpleados();
        System.out.println("El Sueldo bruto es : "+ empleado.CalculoSueldoBruto());
        System.out.println("Los detalles son : " + empleado.datos());
    }
    private static Empleado setEmpleados()
    {
        int dniValidation,edadValidation;
        Scanner scanner  = new Scanner(System.in);
        Empleado empleado = new Empleado();
        System.out.println("Ingrese el nombre ");
        empleado.setNombre(scanner.next());
        System.out.println("Ingrese el apellido");
        empleado.setApellido(scanner.next());
        do{
            System.out.println("Ingrese el dni");
            dniValidation = empleado.setDni(scanner.next());
        }while ( dniValidation !=0);
        do{
            System.out.println("Ingrese la edad");
            edadValidation = empleado.setEdad(scanner.nextInt());
        }while (edadValidation !=0);
        System.out.println("Sueldo Base");
        empleado.setSueldoBase(scanner.nextDouble());
        System.out.println("Pago por hora Extra");
        empleado.setHorasExtra(scanner.nextDouble());
        System.out.println("pago por hora extra en el mes");
        empleado.setHorasExtraMes(scanner.nextDouble());
        System.out.println("Ingrese el sexo : M:Masculino y F:Femenino");
        empleado.setSexo(scanner.next());
        System.out.println("Estas Casado  o no");
        empleado.setEstadoCivil(scanner.next());
        System.out.println("Numero Hijos");
        empleado.setNumeroHijos(scanner.nextInt());
        return empleado;
    }

}
