/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
/**
 *
 * @author Alumno
 */
public class Test1 {
    static void pagar (FormaPago pago){
        System.out.println("Forma de pago:"  +  pago);
    }
    public static void main(String[] args) {
    FormaPago pago1 =new Efectivo();
    pagar(pago1);
    
    pago1 = new TarjetaCredito();
    pagar(pago1);
    
    pago1 = new Yape();
    pagar(pago1);
    }
   
    
}
