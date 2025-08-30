/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

    public class ejmplo2 {
        public static void main(String[] args) {
            
          // conversión automática
    int nota = 16;
    float notaFinal = nota;
    System.out.println("Nota: " + nota + " - Nota final: " + notaFinal);
    
    // conversion requiere cast de tipos
    double x = 128.45, y = 22.67;
    double cocienteReal = x / y;
    int cocienteEntero = (int) cocienteReal;
    System.out.println("Cociente real: " + cocienteReal);
    System.out.println("Cociente entero: " + cocienteEntero);
 
        }
}
