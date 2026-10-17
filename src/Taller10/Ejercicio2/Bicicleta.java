package Taller10.Ejercicio2;

public class Bicicleta extends Vehiculo {
    private String tipoBicicleta;

    public Bicicleta(String tipo, String tipoBicicleta) {
        super(tipo);
        setTipoBicicleta(tipoBicicleta);
    }

    @Override
    public void moverse() {
        super.moverse();
        System.out.println("La bicicleta de tipo " + tipoBicicleta + " se desplaza pedaleando.");
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        if (tipoBicicleta == null || tipoBicicleta.trim().isEmpty()) {
            this.tipoBicicleta = "Bicicleta desconocida";
        } else {
            this.tipoBicicleta = tipoBicicleta;
        }
    }
}
