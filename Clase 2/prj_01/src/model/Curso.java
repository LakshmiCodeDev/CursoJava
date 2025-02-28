/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Engel
 */
public class Curso {
    
    private int cod_curso;
    public String nombre;
    private String fec_inicio;
    
    public void registrarCurso(int cod, String nom, String fec) {
        cod_curso = cod;
        nombre = nom;
        fec_inicio = fec;
    }
    
    public void mostrar() {
        System.out.println("Código          : " + cod_curso);
        System.out.println("Nombre          : " + nombre);
        System.out.println("Fecha de inicio : " + fec_inicio);
    }
    
    public void modificarFechaInicio(String nuevaFecha) {
        fec_inicio = nuevaFecha;
    }
    
}
