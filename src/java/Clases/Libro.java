/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Libro {
    private String codigo;
    private String nombre;
    private String pasta;
    private String editorial;
    private String años;
  
    
    public Libro(String codigo, String nombre, String correo, String direccion, String pasta, String editoria, String años ){
        this.codigo=codigo;
        this.nombre=nombre;
        this.pasta=pasta;
        this.editorial=editoria;
        this.años=años;
    }

    public Libro(String parameter, String parameter0, String parameter1, String parameter2, String parameter3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }

    public String getEditoria() {
        return editorial;
    }

    public void setEditoria(String editorial) {
        this.editorial = editorial;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

   
    
}

