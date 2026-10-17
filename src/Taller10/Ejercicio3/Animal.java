package Taller10.Ejercicio3;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        setEspecie(especie);
    }

    public void emitirSonido() {
        System.out.println("El animal emite un sonido.");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            this.especie = "Especie desconocida";
        } else {
            this.especie = especie;
        }
    }
}
