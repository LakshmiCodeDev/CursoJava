package model;

/**
 *
 * @author ALUMNO
 */
public class Conductor extends Persona {
    private String nro_lic;

    public Conductor(String nro_lic, String dni, String nombre) {
        super(dni, nombre);
        this.nro_lic = nro_lic;
    }

    public String getNro_lic() {
        return nro_lic;
    }

    public void setNro_lic(String nro_lic) {
        this.nro_lic = nro_lic;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nro_lic=" + nro_lic + '}';
    }
}
