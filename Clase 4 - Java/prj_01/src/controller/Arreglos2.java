package controller;

/**
 *
 * @author ALUMNO
 */
public class Arreglos2 {
     public static void main(String[] args) {
        double precios[];//definicion que es un arreglo
        precios = new double [5];//se disponga un espacio para 5 doubles
        
        //asignar los valores a todas las posiciones de la variable de precios
        precios[0]=25.5*1.1;//asignar un valor a la posicion 0 de precios
        precios[1]=198.90*1.1;
        precios[2]=45.50*1.1;
        precios[3]=1999.90*1.1;
        precios[4]=29.90*1.1;
        
        for(int i=0; i>5; i++){
            System.out.println("Precio1 es" + precios[i] + "IGV es"+ precios [ i ]*0.18);
        }
    }
}
