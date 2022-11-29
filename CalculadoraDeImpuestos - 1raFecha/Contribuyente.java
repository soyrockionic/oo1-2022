package calculadoradeimpuestos;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
    
    private String nombre;
    private String dni;
    private String email;
    private String localidad;
    private List<Item> bienes;
    
    public Contribuyente(String nombre, String dni, String email, String localidad){
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.localidad = localidad;
        this.bienes = new ArrayList<Item>();
    }
    
    public void AgregarPropiedad(Item item){
        this.bienes.add(item);
    }
    
    public List<Item> getBienes(){
        return this.bienes;
    }
    
    public double calcularMontoTotal() {
	return this.getBienes().stream().mapToDouble(impuesto -> impuesto.CalcularMonto()).sum();
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
