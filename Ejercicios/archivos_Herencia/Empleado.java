/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libreria;

public class Empleado extends Persona{
 protected double sueldoBase ;

    public Empleado() {
    }

    public Empleado(String nombre, String FechaNacimiento, int dni, double sueldoBase) {
        super(nombre, FechaNacimiento, dni);
        this.sueldoBase=sueldoBase;
    }
    
    public double getsueldo(){
        return sueldoBase;
    }
    
 @Override
    public void imprimirDatos(){
        System.out.println();
        System.out.println();
        super.imprimirDatos();
        System.out.println();
        System.out.println();
    }
}
