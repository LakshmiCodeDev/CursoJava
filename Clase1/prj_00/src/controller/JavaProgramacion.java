package controller;

/**
 *
 * @author ALUMNO
 */
public class JavaProgramacion {
    public static void main(String[] args) {
        float calificacion=25;
        
         if (calificacion >= 14 && calificacion <= 20) {
            System.out.println("Aprobado");
        } else if (calificacion > 10 && calificacion < 14) {
            System.out.println("Para Sustitutorio");
        } else if (calificacion >= 0 && calificacion <= 10) {
            System.out.println("Desaprobado");
        } else {
            System.out.println("Calificacion Invalida");
        } 
    }
    
}
