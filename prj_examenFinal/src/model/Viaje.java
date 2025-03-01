package model;
/**
 *
 * @author ALUMNO
 */
public class Viaje {
    private String cod_Viaje;
    private String origen;
    private String destino;
    private Pasajero pasajero; 
    private Conductor conductor;

    public Viaje(String cod_Viaje, String origen, String destino, Pasajero pasajero, Conductor conductor) {
        this.cod_Viaje = cod_Viaje;
        this.origen = origen;
        this.destino = destino;
        this.pasajero = pasajero;
        this.conductor = conductor;
    }

    public String getCod_Viaje() {
        return cod_Viaje;
    }

    public void setCod_Viaje(String cod_Viaje) {
        this.cod_Viaje = cod_Viaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Viaje{" + "cod_Viaje=" + cod_Viaje + ", origen=" + origen + ", destino=" + destino + ", pasajero=" + pasajero + ", conductor=" + conductor + '}';
    }
}
