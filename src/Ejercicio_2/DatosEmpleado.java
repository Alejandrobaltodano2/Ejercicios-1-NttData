package Ejercicio_2;

public class DatosEmpleado {
    private String nombre;
    private String apellido;
    private String Dni;
    private int edad;
    private double sueldoBase;
    private double horasExtra;
    private double horasExtraMes;
    private String sexo ;
    private String estadoCivil;
    private Integer numeroHijos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return Dni;
    }

    public int setDni(String dni) {
        if (dni.length() ==8)
            this.Dni = dni;
        else return -1;
        return 0 ;
    }

    public int getEdad() {
        return edad;
    }

    public int  setEdad(int edad) {
        if(1< edad && edad <100)
            this.edad = edad;

        else return -1;
        return 0 ;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getHorasExtraMes() {
        return horasExtraMes;
    }

    public void setHorasExtraMes(double horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
}
