/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class FormaPago {
    protected double monto;
    protected String formapago;
    
    public FormaPago(String formapago) {
        this.formapago = formapago;
        monto = 0.0;
    }

    @Override
    public String toString() {
        return "FormaPago{" + "monto=" + monto + ", formapago=" + formapago + '}';
    }
    
}
