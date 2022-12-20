package mantenimiento;

import java.time.LocalDate;

public abstract class Contrato{
    
    private Servicio serv;
    private LocalDate fecha;
    
    public Contrato(Servicio serv, LocalDate fecha){
        this.serv = serv;
        this.fecha = fecha;
    }
    
    public Servicio getServicio(){
        return this.serv;
    }
    
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public abstract double ObtenerMontoAbonar();
    
}
