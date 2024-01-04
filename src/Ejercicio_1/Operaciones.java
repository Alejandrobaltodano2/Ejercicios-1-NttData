package Ejercicio_1;


public class Operaciones extends Calculadora {

    public double suma(){
        return this.getX()+this.getY();
    }
    public double resta(){
        return this.getX()-this.getY();
    }
    public double multiplicacion (){
        return this.getX()*this.getY();
    }
    public double division(){
        return this.getX()/this.getY();
    }


    public static String isPar(double x )
    {
        if (x % 2 ==0) return "Es par";
        else return "Es inpar";
    }

    public static Integer sumatoria (int inicio , int  f ){
        Integer sum =0 ;
        for(int i  = inicio; i < f; i++){
            sum += i;
        }
        return sum;
    }

}