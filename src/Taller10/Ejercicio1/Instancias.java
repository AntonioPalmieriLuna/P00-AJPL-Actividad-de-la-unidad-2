package Taller10.Ejercicio1;

public class Instancias {
    static void main() {
        Persona persona = new Persona("Carlos", 40);
        Estudiante estudiante = new Estudiante("Ana", 20, "Ingeniería de Sistemas");
        Profesor profesor = new Profesor("Roberto", 50, "Programación");

        persona.presentarse();

        System.out.println();

        estudiante.presentarse();

        System.out.println();

        profesor.presentarse();
    }
}
