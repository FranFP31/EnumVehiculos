public class Vehiculos {
    String marca;
    double cilidrada;
    String color;
    String modelo;
    int anio;
    String Combustible;

    public Vehiculos(String marca, double potencia, String color, String modelo, int anio, String combustible) {
        this.marca = marca;
        this.cilidrada = potencia;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
        this.Combustible = combustible;
    }

    public Vehiculos(String ford, double potencia, String negro, String focus, int anio, Marcas.Combustible combustible) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return cilidrada;
    }

    public void setPotencia(double potencia) {
        this.cilidrada = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String combustible) {
        Combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", potencia=" + cilidrada +
                ", color='" + color + '\'' +
                ", Combustible='" + Combustible + '\'' +
                '}';
    }
}
