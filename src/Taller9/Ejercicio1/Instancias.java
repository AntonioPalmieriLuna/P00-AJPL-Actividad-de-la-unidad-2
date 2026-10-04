package Taller9.Ejercicio1;

public class Instancias {
    static void main() {
        Persona persona1 = new Persona("Juan", 30);
        Empleado empleado1 = new Empleado("Maria", 25, "Ventas");

        persona1.mostrarDetalles();

        System.out.println();

        empleado1.mostrarDetalles();
    }
}
