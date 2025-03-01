/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
/**
 *
 * @author ALUMNO
 */
public class Test2 {
    public static void main(String[] args) {
         Persona p1 = new Persona ("12345678","miguel nagel");
        Persona p2 = new Persona ("12345678","anamaria");
        
        //equipoFutbol 1 a muchos 
        EquipoFutbol eq = New EquipoFutbol("boca junior");
        eq.addJugador(p1);
        eq.addJugador(p2);
        eq.addJugador(new Persona ("66666", "abel"));
        eq.addJugador(new Persona("77777","andres"));
        System.out.println(eq);
        eq.mostrarJugadores();
        
    }
}
