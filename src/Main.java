public class Main {
    public static void main(String[] args) {

        //JUAN MARTIN PINEDA RUBIANO

        //NOTA
        /*Clase abstracta Vehiculo
        /3 atributos marca, modelo y combustible.
        /Metodos abstractos encender, apagar, mostrarInfo.
        /Metodo abastecerCombustible.
        /Interface vehiculoElectrico
        /metodos cargarBateria(Simular carga de bateria) y nivelBateria (Mostar bateria)
        /Clase hija Carro
        /Clase hija Camion
        /Clase hija Moto
        /Clase hija CarroElectrico hereda clase Vehiculo e implementa los metodoos de la interface
        (Clases hijas sobreescribir los metodos)
        /Main 1 objeto de cada tipo e invocar sus metodos.*/

        Carro carro = new Carro("Renault", "Sandero", 20);

        System.out.println("CARRO:\n");
        carro.encender();
        carro.apagar();
        carro.mostrarInfo();
        carro.abastecerCombustible();
        carro.mostrarInfo();

        Camion camion = new Camion("Kenworth", "T880", 100);

        System.out.println("CAMION:\n");
        camion.encender();
        camion.apagar();
        camion.mostrarInfo();
        camion.abastecerCombustible();
        camion.mostrarInfo();

        Moto moto = new Moto("Suzuki", "M109R", 15);

        System.out.println("MOTO:\n");
        moto.encender();
        moto.apagar();
        moto.mostrarInfo();
        moto.abastecerCombustible();
        moto.mostrarInfo();

        CarroElectrico carroElectrico = new CarroElectrico("Tesla", "Model 3", 90);
        System.out.println("MOTO:\n");
        carroElectrico.encender();
        carroElectrico.apagar();
        carroElectrico.mostrarInfo();
        carroElectrico.nivelBateria();
        carroElectrico.cargarBateria();
        carroElectrico.mostrarInfo();
    }
}