package Ejercicio_3;

public class Persona {
    private String nombre="";
    private String apellido ="";
    private Integer edad =0;
    private  String dni;
    private char Sexo = 'H';
    private  long peso =0;
    private long altura =0;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = sexo;
    }

    public Persona(String nombre, String apellido, Integer edad, String dni, char sexo, long peso, long altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.Sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {

        return dni;
    }

    public Integer setDni(String dni) {
        if(dni.length()==8){
            this.dni = dni;
            return 1;
        }
        return 0 ;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        this.Sexo = sexo;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }
}
