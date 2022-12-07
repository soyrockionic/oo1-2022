package calculadoradeimpuestos;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Sistema {
    
    private List<Contribuyente> contribuyentes;

    public Sistema() {
        this.contribuyentes = new ArrayList<Contribuyente>();
    }
    
    public Contribuyente DarAltaContribuyente(String nombre, String dni, String email, String localidad){
        Contribuyente c = new Contribuyente(nombre,dni,email,localidad);
        this.contribuyentes.add(c);
        return c;
    }
    
    public Inmueble DarAltaInmueble(String partida, double valorLote, double valorEdif, Contribuyente c){
        Inmueble inmueble = new Inmueble(partida,valorLote,valorEdif);
        c.AgregarPropiedad(inmueble);
        return inmueble;
    }
    
    public Automotor DarAltaAutomotor(String pat, String marca, String modelo, LocalDate fechaFab, double valor, Contribuyente c){
        Automotor auto = new Automotor(pat,marca,modelo,fechaFab,valor);
        c.AgregarPropiedad(auto);
        return auto;
    }
    
    public Embarcacion DarAltaEmbarcacion(String patente, String nombre, LocalDate fechaFab, double valor, Contribuyente c){
        Embarcacion barco = new Embarcacion(patente,nombre,fechaFab,valor);
        c.AgregarPropiedad(barco);
        return barco;
    }
    
    public Contribuyente buscarContribuyente(String DNI) {
        return this.contribuyentes.stream().filter(c -> c.getDni().equals(DNI)).findFirst().orElse(null);
    }
    
    public List<Contribuyente> getContribuyentes(){
        return this.contribuyentes;
    }
    
    public double CalcularTotalImpuestos(Contribuyente c){
        return contribuyentes.get(contribuyentes.indexOf(c)).calcularMontoTotal();
    }
    
    protected List<Contribuyente> ObtenerContribuyentes(String ciudad){
        return contribuyentes.stream().filter(c -> c.getLocalidad().equals(ciudad))
             .collect(Collectors.toList());
    }
    
    public List<Contribuyente> ContribuyentesQueMasPagan(String ciudad, int n){
        List<Contribuyente> contrMas = ObtenerContribuyentes(ciudad).stream()
        .sorted(Comparator.comparingDouble(Contribuyente::calcularMontoTotal).reversed())
        .collect(Collectors.toList());       
        return contrMas.stream().limit(n).collect(Collectors.toList());
    }
    
}