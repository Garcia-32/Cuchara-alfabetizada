/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mezcladirecta;
 import java.util.Scanner;
public class mezcladirectaLetras {


    // Función para realizar la mezcla directa (merge sort) para caracteres
    public static void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Ordenar la primera mitad
            mergeSort(arr, left, mid);

            // Ordenar la segunda mitad
            mergeSort(arr, mid + 1, right);

            // Mezclar las dos mitades ordenadas
            merge(arr, left, mid, right);
        }
    }

    // Función para mezclar dos subarreglos ordenados de caracteres
    public static void merge(char[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] leftArray = new char[n1];
        char[] rightArray = new char[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de letras a ordenar: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        char[] letters = new char[n];

        System.out.println("Ingrese las letras (una por línea o separadas por espacios):");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            while (input.isEmpty()) {
                input = scanner.nextLine(); // Asegurar que no sea cadena vacía
            }
            letters[i] = input.charAt(0);
        }

        // Ordenar el arreglo de letras
        mergeSort(letters, 0, n - 1);

        System.out.println("Letras ordenadas:");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        System.out.println();

        scanner.close();
    }
}

