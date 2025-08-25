/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.sesión.pkg2;

import java.util.Scanner;

public class SegundoEjercicio {

    public static void main(String[] args) {
        // Definición de variables
        double dolares;
        double soles;
        final double TIPO_CAMBIO = 3.48; // Tipo de cambio de dólares a soles

        // Crear un objeto Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la cantidad de dolares a convertir: ");
        dolares = entrada.nextDouble();

        // Operación: conversión de dólares a soles
        soles = dolares * TIPO_CAMBIO;

        // Salida de datos
        System.out.printf("La cantidad de %.2f dolares equivale a %.2f soles.\n", dolares, soles);

        // Cerrar el scanner
        entrada.close();

    
}
}