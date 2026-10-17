package Taller10.Ejercicio1;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public void presentarse() {
        System.out.println("Hola, soy una persona. Nombre: " + nombre + ", Edad: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Nombre desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }
    }
}
