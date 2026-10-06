package Taller9.Ejercicio3;

public class Empleado extends Persona{
    private String puesto;

    public Empleado(String nombre, String puesto) {
        super(nombre);
        this.puesto = puesto;
    }

    public void mostrarPuesto(){
        // Error: 'nombre' tiene acceso privado en la clase base 'Persona' y no se puede acceder con super por encapsulamiento
        // System.out.println("Nombre: "+super.nombre);
        System.out.println("Puesto: "+puesto);
    }
}
