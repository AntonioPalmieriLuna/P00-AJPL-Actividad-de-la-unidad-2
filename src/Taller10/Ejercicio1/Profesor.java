package Taller10.Ejercicio1;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        setAsignatura(asignatura);
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Rol: Profesor, Asignatura: " + asignatura);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        if (asignatura == null || asignatura.trim().isEmpty()) {
            this.asignatura = "Asignatura desconocida";
        } else {
            this.asignatura = asignatura;
        }
    }
}
