/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
      this.radio = radio;
    }
    @Override
    public void calcularArea() {
        double area = 3.1415 * radio *radio;
        System.out.println("El área del círculo es: " + area);
    }
}
