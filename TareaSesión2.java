/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.sesión.pkg2;

import java.util.Scanner;
public class TareaSesión2 {

    
    public static void main(String[] args) {
      

        // Definición de variables
        double celsius;      // Variable para almacenar la temperatura en Celsius
        double fahrenheit;    // Variable para almacenar la temperatura convertida a Fahrenheit

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos por teclado
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = scanner.nextDouble();  // Leer el valor ingresado por el usuario

        // Operación: conversión de Celsius a Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Salida y resultado mediante un mensaje
        System.out.printf("La temperatura en grados Fahrenheit es: %.2f°F%n", fahrenheit);

        // Cerrar el scanner
        scanner.close();
    }
}

    
    

