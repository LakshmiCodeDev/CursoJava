package controller;

/**
 *
 * @author ALUMNO
 */
public class DecisionDosOpciones {
    public static void main(String[] args) {
        //Determinar si un alumno a aprbado el curso de Java Programacion
        //Si calificacion final es mayor o menor a 14 mostrar
        //APROBADO de otra forma mostrar desaprobado
        float CaliFinal = 17.8f;
        if(CaliFinal>=14){
            System.out.println("APROBADO con " + CaliFinal);
        }else{
            System.out.println("DESAPROBADO con " + CaliFinal);
        }
    }
}
