/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DELL
 */
public class LibroController {
      Libro[] tablaALumno;
    int indiceArray;
    
    public LibroController(){
        this.tablaALumno = new Libro[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno(Libro alumno){
        this.tablaALumno[this.indiceArray]=alumno;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Libro[] getAlumnos(){
        return this.tablaALumno;
    }
    
}