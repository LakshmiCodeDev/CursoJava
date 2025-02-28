package model;

/**
 *
 * @author Engel
 */
public class Boleto {
    private int cod_boleto;
    private String origen;
    private String destino;
    private static int contador = 0; // Esta variable es compartida entre todas las instancias

    public Boleto(String origen, String destino) {
        Boleto.contador++;  // Incrementa el contador de manera correcta
        this.cod_boleto = Boleto.contador;  // Asigna el valor actualizado
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Boleto{" + "cod_boleto=" + cod_boleto + ", origen=" + origen + ", destino=" + destino + '}';
    }
    
}
