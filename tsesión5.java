/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesión5;

    import java.util.Scanner;

public class tsesión5 {
  public static void main(String[] args) {
    
    Scanner lector = new Scanner(System.in);
    
    
    System.out.println("Ingrese su sexo (F/M): ");
    String sexo = lector.nextLine();
            
    System.out.println("Ingrese su edad: ");
    byte edad = lector.nextByte();
    
    if(sexo.equals("F")){
        if(edad>=60){
        System.out.println("Aplica para jubilarse");
        }else{
        System.out.println("No puede jubilarse");
        }
    }else{
         if(edad>=65){
       System.out.println("Aplica para jubilarse");
         }else{
       System.out.println("No puede jubilarse");
}
    }
}
}

