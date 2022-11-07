package calculadoradeimpuestos;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
    
    private String nombre;
    private String dni;
    private String email;
    private String localidad;
    private List<Impuesto> bienes;
    
    public Contribuyente(String nombre, String dni, String email, String localidad){
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.localidad = localidad;
        this.bienes = new ArrayList<Impuesto>();
    }
    
    public void AgregarPropiedad(Impuesto imp){
        this.bienes.add(imp);
    }
    
    public List<Impuesto> getBienes(){
        return this.bienes;
    }
    
    public double calcularMontoTotal() {
	return this.getBienes().stream().mapToDouble(impuesto -> impuesto.CalcularValor()).sum();
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public String getLocalidad(){
        return this.localidad;
    }
    
    public String toString(){
        return this.nombre + " " + this.dni + " " + this.localidad + " " + this.calcularMontoTotal();
    }
    
}
