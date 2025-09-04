/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mezcladirecta;

import java.util.Scanner;

public class MezclaDirecta {

    // Función para realizar la mezcla directa (merge sort)
    public static void mergeSort(int[] arr, int left, int right) {
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

    // Función para mezclar dos subarreglos ordenados
    public static void merge(int[] arr, int left, int mid, int right) {
        // Tamaños de los subarreglos
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crear arreglos temporales
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Índices iniciales de los subarreglos
        int i = 0, j = 0;
        int k = left;

        // Mezclar los arreglos temporales de vuelta en arr
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

        // Copiar los elementos restantes de leftArray si hay
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de rightArray si hay
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a ordenar: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Ordenar el arreglo usando merge sort
        mergeSort(numbers, 0, n - 1);

        System.out.println("Números ordenados:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
