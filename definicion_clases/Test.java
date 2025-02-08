
/**
 * Esta clase es para probar las funcionalidades de las clases definidas
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main (String x [ ] ) {
        //Definicion/creacion del objeto
        //nombre_clase nombre_objeto;        
        Alumno alumn1;
        
        //Inicializar el objeto (darle espacio en memoria)
        //opcionalmente darle valores iniciales
        alumn1=null; //Es nada (no tiene espacio en memoria)
        
        //...muchas lineas adelante recien se requiere llenar datos
        alumn1 = new Alumno(); //asignar espacio de memoria
        
        alumn1.registrarAlumno(12345,"tello" , "Angie",4 );
        
        alumn1.mostrarCarnet();
        
        
        
    }
}
