package Taller9.Ejercicio3;

public class Instancias {
    static void main() {
        Persona persona = new Persona("Carlos");
        Empleado empleado = new Empleado("Ana", "Gerente");

        persona.mostrarNombre();

        System.out.println();

        empleado.mostrarPuesto();
    }
}
