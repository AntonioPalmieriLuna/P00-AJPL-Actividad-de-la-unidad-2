package Taller10.Ejercicio2;

public class Instancias {
    static void main() {
        Vehiculo vehiculo = new Vehiculo("Terrestre");
        Bicicleta bicicleta = new Bicicleta("Terrestre", "Montaña");

        vehiculo.moverse();

        System.out.println();

        bicicleta.moverse();
    }
}
