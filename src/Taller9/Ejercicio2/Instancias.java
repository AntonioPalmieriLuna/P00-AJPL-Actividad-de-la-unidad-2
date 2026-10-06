package Taller9.Ejercicio2;

public class Instancias {
    static void main() {
        Animal animal = new Animal("Mojarra");
        Pez pez = new Pez("Bocachico", "Salada");

        animal.mostrarEspecie();

        System.out.println();

        pez.mostrarEspecie();
    }
}
