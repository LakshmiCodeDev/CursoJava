/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Persona;
import java.util.ArrayList;

/**
 *
 * @author ALUMNO
 */
public class EquipoFutbol {
    private String nombre;
    //los jugadores son exclusivamente del tipo persona 
    private ArrayList<Persona> jugadores;

    public EquipoFutbol(String nombre, ArrayList<Persona> jugadores) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();//crear el objeto para guardar jugadores 
    }
    
    public void addJugador(Persona p){
        jugadores.add(p);
    }
    
    //mostrar la lista de jugadores
    public void mostrarJugadores(){
        for(Persona j: jugadores){
            System.out.println(j);
        }
    }
}
