package model;

/**
 *
 * @author Alumno
 */
public class ProductoFarmacia extends Producto {
    private boolean requiereReceta;

    public ProductoFarmacia(boolean requiereReceta, String nombre, double precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.requiereReceta = requiereReceta;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    @Override
    public String toString() {
        return "ProductoFarmacia{" + "requiereReceta=" + requiereReceta + '}';
    }
    
    
    
    
}
