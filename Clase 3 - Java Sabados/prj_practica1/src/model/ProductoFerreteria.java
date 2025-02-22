package model;

/**
 *
 * @author Alumno
 */
public class ProductoFerreteria extends Producto {
    private String material;

    public ProductoFerreteria(String material, String nombre, double precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ProductoFerreteria{" + "material=" + material + '}';
    }
    
    
    
}
