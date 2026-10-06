package Taller9.Ejercicio3;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        // Error: super no se puede utilizar en una clase que no es derivada
        // super.mostrarNombre();
        System.out.println("Nombre: "+nombre);
    }
}
