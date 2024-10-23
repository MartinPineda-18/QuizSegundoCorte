import java.util.Scanner;

public class Camion extends Vehiculo{

    Scanner teclado = new Scanner(System.in);

    @Override
    void encender() {
        System.out.println("Camion encendido");

    }

    @Override
    void apagar() {
        System.out.println("Camion apagado");

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca del camion: " + getMarca() + "\n"
                + "Modelo del camion: " + getModelo() + "\n"
                + "Nivel de combustible: " + getCombustible() + "\n");

    }

    @Override
    public void abastecerCombustible(){
        System.out.println("Ingrese el combustible que desea cargar al camion: ");
        setCombustible(teclado.nextDouble());

    }

    public Camion() {
    }

    public Camion(String marca, String modelo, double combustible) {
        super(marca, modelo, combustible);
    }
}
