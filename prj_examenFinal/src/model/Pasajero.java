package model;

/**
 *
 * @author ALUMNO
 */
public class Pasajero extends Persona {
    private String cod_pasajero;

    public Pasajero(String cod_pasajero, String dni, String nombre) {
        super(dni, nombre);
        this.cod_pasajero = cod_pasajero;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "cod_pasajero=" + cod_pasajero + '}';
    }
}
