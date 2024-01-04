package Ejercicio_2;


public class Empleado extends DatosEmpleado implements  EmpleadoInterface{

    @Override
    public double CalculoSueldoBruto() {
        double cobroExtra = this.getHorasExtra()* this.getHorasExtraMes();
        return this.getSueldoBase()+cobroExtra;


    }
    private String MayorEdad()
    {
        if(this.getEdad()>18) return "Si es mayor De edad";
        else return "No es mayor de edad";
    }
    @Override
    public String datos() {


        double ingresoBruto = this.CalculoSueldoBruto();
        return "Nombre Completo: " +this.getNombre()+this.getApellido() + " Dni : " +this.getDni()+" Ingreso Bruto : "+ ingresoBruto
                +" Ingreso total por horas extra: "+(this.getHorasExtra()* this.getHorasExtraMes())+" Es mayor de edad : "+ MayorEdad()+" Estado Civul :"+ this.getEstadoCivil()+
                " Nro Hijos "+this.getNumeroHijos()
                ;
    }
}
