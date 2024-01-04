package Ejercicio_3;

public class PersonaMetodos extends  Persona implements  InterfacePersona{

    private char comprobarSexo(char sexo) {

        char comprobacion = Character.toUpperCase(sexo);
        if(comprobacion  =='H' || comprobacion =='M')
            return sexo;
        return 'H';
    }

    @Override
    public Integer CalcularIMc() {
        double peso_ideal = this.getPeso()/(Math.pow(this.getAltura(),2));
        if(peso_ideal <20) return -1;
        else if (20<=peso_ideal && peso_ideal<=26) return 0;
        return 1;

    }

    @Override
    public boolean esMayorDeEdad() {
        if(18<=this.getEdad())
            return true ;
        return false;
    }

    @Override
    public String toString() {
        return "El nombre : "+this.getNombre()+" Apellido: "+this.getApellido()+
                " Edad: "+this.getEdad()+ " dni: "+this.getDni()+" sexo: "+this.getSexo()+
                " peso: "+this.getPeso()+ " altura: "+this.getAltura()
                ;
    }
}
