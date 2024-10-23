import java.util.Scanner;

public class Moto extends Vehiculo{

    Scanner teclado = new Scanner(System.in);

    @Override
    void encender() {
        System.out.println("Moto encendida");

    }

    @Override
    void apagar() {
        System.out.println("Moto apagada");

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca de la moto: " + getMarca() + "\n"
                + "Modelo de la moto: " + getModelo() + "\n"
                + "Nivel de combustible: " + getCombustible() + "\n");

    }

    @Override
    public void abastecerCombustible(){
        System.out.println("Ingrese el combustible que desea cargar a la moto: ");
        setCombustible(teclado.nextDouble());

    }

    public Moto() {
    }

    public Moto(String marca, String modelo, double combustible) {
        super(marca, modelo, combustible);
    }
}
