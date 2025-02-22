package controller;
import model.Producto;
import model.ProductoFarmacia;
import model.ProductoFerreteria;
import model.PlatoRestaurante;
/**
 *
 * @author Alumno
 */
public class Test {
    public static void main(String[] args) {
        model.ProductoFarmacia paracetamol = new model.ProductoFarmacia("paracetamol",5,
                "alivia el dolor y la fiebre", "paracetamol500mg" );
        System.out.println(paracetamol);
        
        model.ProductoFerreteria martillo = new model.ProductoFerreteria("martillo",25,
                "mango de acero", "martillo grande" );
        System.out.println(martillo);
        
        model.PlatoRestaurante lomo = new model.PlatoRestaurante ("lomo saltado",15,
                "con papa", "lomo saltado grande" );
        System.out.println(lomo);
}
}

