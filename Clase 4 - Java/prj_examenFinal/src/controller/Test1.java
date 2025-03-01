package controller;
import model.*;
/**
 *
 * @author ALUMNO
 */
public class Test1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("12345678", "Juan Perez");
        Persona persona2 = new Persona("87654321", "Ana Garcia");

        Conductor conductor = new Conductor("123", "34568974", "Axel Lopez");

        Pasajero pasajero = new Pasajero("080", "71834256", "Laura Mendoza");

        Viaje viaje = new Viaje("v108", "Lima", "Cusco", pasajero, conductor);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(conductor);
        System.out.println(pasajero);
        System.out.println(viaje);
    }
}
