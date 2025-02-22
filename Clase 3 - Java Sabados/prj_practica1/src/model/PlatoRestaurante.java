package model;

/**
 *
 * @author Alumno
 */
public class PlatoRestaurante extends Producto {
    private int calorias;

    public PlatoRestaurante(int calorias, String nombre, double precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "PlatoRestaurante{" + "calorias=" + calorias + '}';
    }
    
    
}
