import java.util.Scanner;

public class Carro extends Vehiculo {

    Scanner teclado = new Scanner(System.in);

    @Override
    void encender() {
        System.out.println("Carro encendido");

    }

    @Override
    void apagar() {
        System.out.println("Carro apagado");

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca del carro: " + getMarca() + "\n"
                + "Modelo del carro: " + getModelo() + "\n"
                + "Nivel de combustible: " + getCombustible() + "\n");

    }

    @Override
    public void abastecerCombustible(){
        System.out.println("Ingrese el combustible que desea cargar al carro: ");
        setCombustible(teclado.nextDouble());

    }

    public Carro() {
    }

    public Carro(String marca, String modelo, double combustible) {
        super(marca, modelo, combustible);
    }
}
