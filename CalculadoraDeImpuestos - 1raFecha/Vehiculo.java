package calculadoradeimpuestos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Vehiculo implements Item{
    
    private String patente;
    private LocalDate fechaFab;
    private double valor;
    
    public Vehiculo(String patente, LocalDate fechaFab, double valor){
        this.patente = patente;
        this.fechaFab = fechaFab;
        this.valor = valor;
    }
    
    public String getPatente(){
        return this.patente;
    }
    
    public LocalDate getFechaFab(){
        return this.fechaFab;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    protected boolean MenorADiezAños(){   
        return ChronoUnit.YEARS.between(getFechaFab(),LocalDate.now()) < 10;
    }
    
    public abstract double CalcularMonto();
    
}
