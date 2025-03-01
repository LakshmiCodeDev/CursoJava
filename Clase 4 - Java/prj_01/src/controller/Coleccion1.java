/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.*;
/**
 *
 * @author ALUMNO
 */
public class Coleccion1 {
    public static void main(String[] args) {
        ArrayList colec1=new ArrayList();
        
        colec1.add(3.14);
        colec1.add(args);
        colec1.add(new Automovil ("abc555", "toyota",2020));
        colec1.add(new Automovil ("abc555", "toyota",2020));
        colec1.add(new Conductor ("abc555", "toyota","hola"));
        colec1.add("ultimo elemento");
        
        
        for(Object e:colec1){
            if(e instanceof Automovil){
                System.out.println(((Automovil)e).getPlaca()); 
            }else{
          System.out.println(e);
            }
            
        }
    }
}
