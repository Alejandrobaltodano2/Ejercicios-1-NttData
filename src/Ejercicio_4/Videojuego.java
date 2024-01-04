package Ejercicio_4;

public class Videojuego  implements EntregableInterface {

    public  String  titulo ;
    public Integer horas =10;
    public boolean entregado  = false;
    public String genero ;
    public String compania;

    public Videojuego() {
    }

    public Videojuego(String titulo, Integer horas) {
        this.titulo = titulo;
        this.horas = horas;
    }


    public Videojuego(String titulo, Integer horas, String genero, String compania) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
    @Override
    public String toString()
    {
        return "Titulo : "+this.titulo + " Horas: "+this.horas + " entregado : "+this.entregado +
                " genero: "+ this.genero+" Compañia: "+this.compania
                ;
    }



}
