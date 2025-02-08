
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    //atributos
    private int cod_alum;
    private String apellidos;
    private String nombres;
    private String DNI;
    private String especialidad;
    private String fec_nacim;
    private String fec_inscrip;
    private int año_estudios;
    
    //metodos(operaciones)
    public void registrarAlumno(int cod, String ape, String nom,
                                int año_est){
        cod_alum = cod;
        apellidos = ape;
        nombres = nom;
        año_est = año_est;
    }
    public int obtenerAñoEstudios(){
       return año_estudios;
    }
    
    public void mostrarCarnet(){
            System.out.println ("Codigo                 :" + cod_alum);
            System.out.println ("Apellidos              :" + apellidos);
            System.out.println ("Nombres                :" + nombres);
            System.out.println ("Año de estudios        :" + año_estudios);
            
    }
}
