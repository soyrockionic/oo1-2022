package ejercicio15.alquilerdepropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OOBnB {
    
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
    
    public OOBnB(){
        
    }
	
    public ArrayList<Usuario> getUsuarios(){
	return this.usuarios;
    }
	
    public ArrayList<Propiedad> getPropiedades(){
	return this.propiedades;
    }
	
    public void registrarUsuario(Usuario user) {
        usuarios.add(user);
    }
	
    public void registrarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }
	
    public void hacerReserva(DateLapse periodo, Propiedad propiedad, Usuario usuario) {
	if(propiedad.estaDisponible(periodo)) {
            Reserva reserva = new Reserva(periodo, propiedad);
            usuario.hacerReserva(reserva);
            propiedad.agregarReserva(reserva);
	}
    }
	
    public void eliminarReserva(Reserva reserva) {
        if(reserva.getPeriodo().getFrom().isBefore(LocalDate.now())) {
            usuarios.forEach(u -> u.eliminarReserva(reserva));
	    propiedades.forEach(p -> p.liberarFecha(reserva));
        }
    }
	
    public double calcularIngresos(Usuario usuario, LocalDate fecha1, LocalDate fecha2) {
	DateLapse periodo = new DateLapse(fecha1,fecha2);
	Usuario u = usuarios.get(usuarios.indexOf(usuario));
	double suma = 0;
	for (Propiedad i: u.getPropiedades()) {
	    if(!i.estaDisponible(periodo)) {
		suma = i.getReservas().stream()
			.mapToDouble(r -> r.calcularPrecio()).sum();
	    }
	}
	return suma;
    }
    
    
}