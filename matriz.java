
package arreglos;
import java.util.Scanner;
public class matriz {
   

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar dimensiones de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = entrada.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = entrada.nextInt();

        // Crear la matriz con las dimensiones ingresadas
        int[][] matriz = new int[filas][columnas];

        // Rellenar la matriz con datos ingresados por el usuario
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Imprimir la matriz completa
        System.out.println("\nLa matriz es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
} 
