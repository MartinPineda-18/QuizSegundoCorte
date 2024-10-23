public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected double combustible;

    abstract void encender();
    abstract void apagar();
    public abstract void mostrarInfo();

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, double combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }


    public void abastecerCombustible(){

    }
}
