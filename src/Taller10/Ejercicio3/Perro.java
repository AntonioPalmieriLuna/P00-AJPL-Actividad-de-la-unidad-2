package Taller10.Ejercicio3;

public class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        setRaza(raza);
    }

    // Error de compilacion: Al cambiar la firma del metodo con @Override no sobrescribe el metodo de la clase base
    // @Override
    // public void emitirSonido(String tipoSonido) {
    //     System.out.println("El perro emite: " + tipoSonido);
    // }

    // Sobrescritura sin @Override: Es mala practica porque si la firma en la clase base cambia o hay un error de escritura en el nombre, no genera error de compilacion y deja de sobrescribir
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.trim().isEmpty()) {
            this.raza = "Raza desconocida";
        } else {
            this.raza = raza;
        }
    }
}
