/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class Rectangulo extends Figura{
    double base;
    double altura;
    
    public Rectangulo(double base,double altura){
        this.altura=altura;
        this.base=base;
}
    @Override
    public void calcularArea(){
        double area = base*altura;
        System.out.println("El area del rectangulo es: "+area);
    }
}