
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    //atributos
    private int cod_curso;
    private String nombre;
    private String fec_inicio;
    
    //metodos
    public void registrarCurso( int cod, String nom_curso, String fec_ini){
        cod_curso= cod;
        nombre = nom_curso;
        fec_inicio = fec_ini;
    }
    
    public void modificarFechaInicio(String nueva_fecha){
       fec_inicio = nueva_fecha; 
    }
    
    public void mostrar(){
            System.out.println ("Codigo                        :" + cod_curso);
            System.out.println ("Nombre del curso              :" + nombre);
            System.out.println ("Fecha de inicio               :" + fec_inicio);
            
        
    }
    
}
