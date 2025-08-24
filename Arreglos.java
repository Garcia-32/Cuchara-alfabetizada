package arreglos;

import java.util.Scanner;


public class Arreglos {

  
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     String[] nombres = new String[5];
int[] edades = new int[5];
for(int i = 0; i < nombres.length; i++) {
System.out.printf("%dº Persona\n", i + 1);
System.out.printf("Ingrese Nombre: ");
nombres[i] = scanner.nextLine();
System.out.printf("Ingrese edad: ");
edades[i] = scanner.nextInt();
scanner.nextLine();
}
for(int i = 0; i < nombres.length; i++) {
System.out.printf("%-16s %2d [%s]\n",
nombres[i], edades[i],
edades[i] >= 18 ?
"Mayor de edad" : "Menor de edad");
}
    }
    
}
