package Taller10.Ejercicio2;

public class Vehiculo {
    protected String tipo;

    public Vehiculo(String tipo) {
        setTipo(tipo);
    }

    public void moverse() {
        System.out.println("El vehículo de tipo " + tipo + " se está moviendo.");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            this.tipo = "Tipo desconocido";
        } else {
            this.tipo = tipo;
        }
    }
}
