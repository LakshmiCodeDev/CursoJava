package controller;

/**
 *
 * @author ALUMNO
 */
public class Participacion {
    public static void main(String[] args) {
        float CaliFinal = 17.8f;
        if(CaliFinal>=14){
            System.out.println("APROBADO con " + CaliFinal);
        }else if (CaliFinal>10 && CaliFinal<14){
            System.out.println("PARA SUSTITUTORIO");
        }else if{
            System.out.println("desaprobado con" + CaliFinal);
        } else {
            System.out.println("Calificacion Invalida");
        } 
    }
}
