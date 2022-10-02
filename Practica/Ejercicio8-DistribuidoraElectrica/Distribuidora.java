package ejercicio8.distribuidoraelectrica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora extends Object {
    
    private double precioKWh;
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    
    public Distribuidora(double precio) {
	this.precioKWh = precio;
    }
    
    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
    
    public List<Factura> facturar() {
	List<Factura> result = this.usuarios.stream()
	.map((Usuario u) -> u.facturarEnBaseA(this.getPrecioKW()))
	.collect(Collectors.toList());
	return result;
    }
    
    public double consumoTotalActiva() {
	return this.usuarios.stream()
	.mapToDouble((Usuario u) -> u.ultimoConsumoActiva()).sum();
    }
    
    public double getPrecioKW() {
	return this.precioKWh;
    }
	
    public List<Usuario> getUsuarios(){
	return usuarios;
    }
    
    
}
