package Taller10.Ejercicio3;

public class Instancias {
    static void main() {
        Animal animal = new Animal("Mamífero");
        Perro perro = new Perro("Mamífero", "Labrador");

        animal.emitirSonido();

        System.out.println();

        perro.emitirSonido();
    }
}
