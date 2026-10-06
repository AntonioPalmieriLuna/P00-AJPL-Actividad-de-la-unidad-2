package Taller9.Ejercicio2;

public class Pez extends Animal{
    private String tipoAgua;

    public Pez(String especie, String tipoAgua) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void mostrarEspecie(){
        super.mostrarEspecie();
        System.out.println("Tipo de agua: "+tipoAgua);
    }
}
