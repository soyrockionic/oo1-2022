package mantenimiento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nombre;
    private String direccion;
    private List<Contrato> contratos;
    
    public Cliente(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.contratos = new ArrayList<Contrato>();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void ContratarServicio(Contrato c){
        this.contratos.add(c);
    }
    
    public List<Contrato> getContratos(){
        return this.contratos;
    }
    
    public double ObtenerMontoAPagar(){
        return this.getContratos().stream().mapToDouble(c -> c.ObtenerMontoAbonar()).sum();
    }
    
    public String toString(){
        return "Cliente: " + this.nombre + " " + this.direccion;
    }
    
}
