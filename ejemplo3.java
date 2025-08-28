/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejemplo3 {
    public static void main(String[] args) {
            
    /*ejecuciòn secuencial: Declaración e inicialización de variables*/
    final double DESCUENTO_SEGURO = 0.035;
    double salarioBruto, montoDescuento, salarioFinal;
    Scanner lector = new Scanner(System.in);
    
    /*Lectura de datos y asignación*/
    System.out.println("Calcularemos su salario neto.");
    System.out.println("Ingrese el monto del salario bruto: ");
    salarioBruto = lector.nextDouble();
    
    /*Operaciones, cálculos y sumarización*/
    montoDescuento = salarioBruto * DESCUENTO_SEGURO;
    salarioFinal = salarioBruto - montoDescuento;
    
    /*Reporte*/
    System.out.println("Salario bruto: " + salarioBruto);
    System.out.println("Monto descuento: " + montoDescuento);
    System.out.println("Salario neto: " + salarioFinal);

    }
}
