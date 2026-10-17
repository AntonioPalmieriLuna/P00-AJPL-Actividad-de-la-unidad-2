package Taller10.Ejercicio1;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        setCurso(curso);
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Rol: Estudiante, Curso: " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isEmpty()) {
            this.curso = "Curso desconocido";
        } else {
            this.curso = curso;
        }
    }
}
