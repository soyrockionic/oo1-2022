package ejercicio3.balanzamejorada;

public class Producto extends Object {
	
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto(String descripcion, double peso, double precioPorKilo) {
        this.peso = peso;
        this.precioPorKilo = precioPorKilo;
        this.descripcion = descripcion;
    }

    public Producto() {
    }
              
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecioPorKilo(double precio) {
        this.precioPorKilo = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public Double getPeso() {
        return this.peso;
    }

    public double getPrecioPorKilo() {
        return this.precioPorKilo;
    }

    public double getPrecio() {
        return (this.getPeso() * this.getPrecioPorKilo());
    }	
	
}
