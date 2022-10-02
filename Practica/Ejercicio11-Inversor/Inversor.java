package ejercicio11.elinversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
    
    String nombre;
    List<Inversion> inversiones;
    
    public Inversor(String nombre) {
	this.nombre = nombre;
	this.inversiones = new ArrayList<>();
    }
    
    
    public void addInversion(Inversion inversion) {
	this.inversiones.add(inversion);
    }
    
    public String getNombre() {
	return nombre;
    }
    
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
	
    public double valorActual() {
        return this.inversiones.stream()
                .mapToDouble(Inversion::valorActual).sum();
    }

    public List<Inversion> getInversiones() {
        return inversiones;
    }
    
    
}
