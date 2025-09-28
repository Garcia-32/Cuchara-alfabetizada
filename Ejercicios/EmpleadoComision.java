/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;


public class EmpleadoComision extends Empleado{
    private double porcentajeComision;
    private double dineroVentas;

    public EmpleadoComision(double porcentajeComision, double dineroVentas) {
        this.porcentajeComision = porcentajeComision;
        this.dineroVentas = dineroVentas;
    }

    public EmpleadoComision( String nombre, String FechaNacimiento, int dni, double sueldoBase, double porcentajeComision) {
        super(nombre, FechaNacimiento, dni, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.dineroVentas = 0;
    }

   
    
    public double Sueldo(){
        return sueldoBase + (int)(dineroVentas*porcentajeComision/100.0);
    }
    
    public void vender(double dineroVenta){
        this.dineroVentas+=dineroVenta;
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