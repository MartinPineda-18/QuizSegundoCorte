import java.util.Scanner;

public class CarroElectrico extends Vehiculo implements VehiculoElectrico {

    Scanner teclado = new Scanner(System.in);

    @Override
    public void cargarBateria() {
        System.out.println("Ingrese el nivel de bateria que desea cargar al carro electrico: ");
        setCombustible(teclado.nextDouble());

    }

    @Override
    public void nivelBateria() {
        System.out.println("Nivel bateria: " + getCombustible());

    }

    @Override
    void encender() {
        System.out.println("Carro electrico encendido");

    }

    @Override
    void apagar() {
        System.out.println("Carro electrico apagado");

    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca del carro electrico: " + getMarca() + "\n"
                + "Modelo del carro electrico: " + getModelo() + "\n"
                + "Nivel de bateria: " + getCombustible() + "\n");

    }

    public CarroElectrico() {
    }

    public CarroElectrico(String marca, String modelo, double combustible) {
        super(marca, modelo, combustible);
    }
}
