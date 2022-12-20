package mantenimiento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    
    private List<Cliente> clientes;
    private List<Servicio> servicios; 
    
    public Sistema(){
        this.clientes = new ArrayList<Cliente>();
        this.servicios = new ArrayList<Servicio>();
    }
    
    public Cliente RegistrarCliente(String nombre, String direccion){
        Cliente c = new Cliente(nombre,direccion);
        this.clientes.add(c);
        return c;
    }
    
    public Servicio RegistrarServDeLimpieza(double precio, int cantHoras, double tarifaMinima){
        Servicio limpieza = new Limpieza(precio,cantHoras,tarifaMinima);
        this.servicios.add(limpieza);
        return limpieza;
    }
    
    public Servicio RegistrarServParquizacion(double precio, int cantHoras, int cantMaq, double costoPorMaq){
        Servicio parq = new Parquizacion(precio,cantHoras,cantMaq,costoPorMaq);
        this.servicios.add(parq);
        return parq;
    }
    
    public void ContratarPorUnicaVez(Cliente c, LocalDate fecha, Servicio serv){
        Contrato contr = new PorUnicaVez(serv,fecha);
        c.ContratarServicio(contr);
    }
    
    public void ContratarProlongado(Cliente c, Servicio serv, LocalDate fechaIni, int cantDias){
        Contrato contr = new Prolongado(serv,fechaIni,cantDias);
        c.ContratarServicio(contr);
    }
    
    public List<Cliente> getClientes(){
        return this.clientes;
    }
    
    public List<Servicio> getServicios(){
        return this.servicios;
    }
    
    public double ObtenerMontoAPagarPorUnCliente(Cliente c){
        return c.ObtenerMontoAPagar();
    }
    
    public int ObtenerCantServiciosMontoMayorAUnValor(double valor){
        return (int) this.getServicios().stream().filter(s -> s.MontoAbonar() > valor).count();
    }
    
}
