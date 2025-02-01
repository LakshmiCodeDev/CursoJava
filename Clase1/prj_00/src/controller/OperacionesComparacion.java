package controller;

/**
 *
 * @author ALUMNO
 */
public class OperacionesComparacion {
    public static void main(String[] args) {
        int a =127, b =49, c =71;
        
        //>,<,>=,<=,!=,==
        System.out.println(" a>b es " + (a>b));
        System.out.println(" b>c es " + (b>c));
        System.out.println(" a!=c es " + (a!=c));
        System.out.println(" a==c es " + (a == c + 56));
        // == es comparacion de igualdad
        // = es operador de asignacion 
        
        //&&(and), ||(or), ! (not)
        //Operaciones lógicas
        System.out.println(" a>b && b>c resulta " + (a>b && b>c));
        System.out.println(" a>b || b>c resulta " + (a>b || b>c));
        System.out.println(" a>b && !(b>c) resulta " + (a>b && !(b>c)));
    }    
}
