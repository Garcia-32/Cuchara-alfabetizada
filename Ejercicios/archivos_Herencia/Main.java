/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo02_herencia;

import Libreria.Empleado;
import Libreria.EmpleadoComision;
import Libreria.Estudiante;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner consola = new Scanner(System.in);
        String nombre, nacimiento;
        int dni;
        double sueldo, porcentajeComision, venta;
        int opcion;
        do{
            System.out.println("""
                               ------------------------------------------
                               1. Empleado
                               2. Estudiante
                               3. Empleado por comisi\u00f3n
                               o. FIN
                               ------------------------------------------
                               Ingrese la opci\u00f3n [0-3]""");
        opcion = consola.nextInt();
                
       System.out.println("Ingrese el nombre: ");
       nombre = consola.next();
       System.out.println("Ingrese Fecha de Nacimiento: ");
       nacimiento = consola.next();
       System.out.println("Ingrese DNI: ");
       dni = consola.nextInt();
       
       switch(opcion){
           case 1:
                System.out.println("Ingrese el sueldo: ");
                sueldo = consola.nextDouble();
                Empleado objEmpleado = new Empleado(nombre, nacimiento, dni, sueldo);
                objEmpleado.imprimirDatos();
                break;
           case 2:
               Estudiante objEstudiante = new Estudiante(nombre, nacimiento, dni);
               objEstudiante.nuevaCalificacion(18);
               objEstudiante.imprimirDatos();
               break;
           case 3:
               System.out.println("Ingrar sueldo: ");
               sueldo = consola.nextDouble();
               System.out.println("Ingrese porcentaje de comisión: ");
               porcentajeComision = consola.nextDouble();
               System.out.println("Ingrar la venta: ");
               venta = consola.nextDouble();
               EmpleadoComision objEmpComision = new EmpleadoComision(nombre, nacimiento, dni, sueldo, porcentajeComision);
               objEmpComision.vender(venta);
               objEmpComision.imprimirDatos();
               break;
          case 0:
              System.exit(0);
              break;
           
       }
        }
        while(true);
    }
    
}
