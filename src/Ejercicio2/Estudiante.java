/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author zunig
 */
public class Estudiante extends Persona{
    String nombre;
    int edad;
    public Estudiante(String nombre, int edad) {
      this.nombre = nombre ;
      this.edad = edad;
    }
    @Override
      public void presentarse() {
          System.out.println("El nombre es: " + nombre);
          System.out.println("La edad es: " + edad);
          System.out.println("Y soy alumna de esta clase");
    }
}
