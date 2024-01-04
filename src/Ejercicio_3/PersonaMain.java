package Ejercicio_3;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        PersonaMetodos persona = setPersonas();
        String pesoIdeal ;
        String mayorEdad;
        switch (persona.CalcularIMc()){
            case -1:
                pesoIdeal = "Debajo del péso ideal";
                break;
            case 0 :
                pesoIdeal ="Peso Ideal";
                break;
            case 1:
                pesoIdeal = "Sobrepeso";
                break;
            default:
                pesoIdeal="";
        }
        if (persona.esMayorDeEdad())
            mayorEdad = "Es mayor de edad";
        else
            mayorEdad="No es mayor de edad";

        System.out.println("El IMC ES : " +pesoIdeal  );
        System.out.println("Es mayor de edad : " + mayorEdad );
        System.out.println(persona.toString());

    }


    private static PersonaMetodos setPersonas()
    {
        PersonaMetodos persona = new PersonaMetodos();
        Integer validacionDni ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Nombre ");
        persona.setNombre(scanner.next());
        System.out.println("Ingrese el apellido: ");
        persona.setApellido(scanner.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(scanner.nextInt());
        do{
            System.out.println("Ingrese el dni");
            validacionDni = persona.setDni(scanner.next());
        }while(validacionDni ==0);
        System.out.println("Ingrese sexo : H/M");
        persona.setSexo(scanner.next().charAt(0));
        System.out.println("Ingrese el peso : ");
        persona.setPeso(scanner.nextLong());
        System.out.println("Ingrese la Altura: ");
        persona.setAltura(scanner.nextLong());
        return persona;
    }
}