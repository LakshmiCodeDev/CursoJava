package controller;

/**
 *
 * @author ALUMNO
 */
public class DecisionUnaOpcion {
    public static void main(String[] args) {
        //Determinar si un año es bisiesto
        //el año debe ser multiplo de 4 pero 
        //no de 100, pero si de 400
        int año=2000;
        
        boolean r =año%4==0 && 
                año % 100 !=0 ||
                año % 400==0;
        if (r==true){
            System.out.println(año + " es bisiesto");
        }
    }
    
}
