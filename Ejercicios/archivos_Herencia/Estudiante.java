/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Estudiante extends Persona{
    private int puntacionTotal;
    private int numeroCalificaciones;

    

    public Estudiante(String nombre, String FechaNacimiento, int dni ) {
        super(nombre, FechaNacimiento, dni);
        this.puntacionTotal=0;
        this.numeroCalificaciones=0;
    }
    
    public double getNotaMedia(){
        return((double) puntacionTotal/numeroCalificaciones);
    }
    
    public void nuevaCalificacion(int puntos){
        puntacionTotal += puntos;
        numeroCalificaciones++;
        
    }
    @Override
    public void imprimirDatos(){
        System.out.println();
        System.out.println();
        super.imprimirDatos();
        System.out.println();
        System.out.println();
    }
}
