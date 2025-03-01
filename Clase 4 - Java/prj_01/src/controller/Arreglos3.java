package controller;
import model.Automovil;


/**
 *
 * @author ALUMNO
 */
public class Arreglos3 {
    public static void main(String[] args) {
        model.Automovil veh1= new model.Automovil("ABC100", "KIA", 2005);
        System.out.println(veh1);
        
        int cantidad=5;
        model.Automovil vehs [] ;
        vehs= new model.Automovil [cantidad];
        
        for(int i=0; i< cantidad; i++){
            vehs[i]=null;
        }
        
        vehs[3] = new model.Automovil("WXY22","HUI", 2010);
        vehs[1] = new model.Automovil("abx","jd", 2009);
        
        System.out.println(" lista");
        for(int i=0; i< cantidad; i++){
            if(vehs [i]!=null)
            System.out.println(vehs [i]);
        }
    }
}
