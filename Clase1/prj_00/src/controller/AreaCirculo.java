package controller;

/**
 *
 * @author Engel
 */
public class AreaCirculo {
    public static void main(String[] args) {
        //Calcular el area de una 
        //circunferencia de radio=2.5
        //operador de asignacion es = 
        //nom_variable=valor; //nom_variable almacena valor.
        float radio=2.5f; //declaracion o definicion de la variable
                      //Tipo_de_dato nombre_variable;
                      //radio tiene asignado un valor inicial
        float area; //variable sin valor inicial
        final float pi = 3.141592f; //pi es una constante, final significa que 
                                    //pi es una constante( no se puede cambiar)
        area = pi *radio * radio;
        System.out.println(" El area de radio " + radio + " es " + area);
        
        //pi=3.13f; //pi es de solo lectura
        System.out.println("pi es" + pi);
        
    }
    
}
