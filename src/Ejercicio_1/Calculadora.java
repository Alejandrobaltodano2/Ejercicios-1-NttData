package Ejercicio_1;


public  abstract class Calculadora  {

    private double x ;
    private double y ;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public int setY(double y) {
        int  validator;
        if (y !=0){
            this.y = y;
            return 0;
        }
       return -1;
    }



}