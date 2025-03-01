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
public class Test1 {
    public static void main(String[] args) {
        Persona p1 = new Persona ("12345678","miguel nagel");
        Persona p2 = new Persona ("12345678","anamaria");
        //pasaporte->persona //pasaporte tiene persona
        Pasaporte pass1 = new Pasaporte ("00", p1);
                System.out.println(pass1);
    }
}
