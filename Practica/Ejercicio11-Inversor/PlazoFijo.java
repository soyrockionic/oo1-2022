package ejercicio11.elinversor;

import java.time.LocalDate;

public class PlazoFijo implements Inversion{
    
    private LocalDate fechaDeConstitucion;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;

    
    public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
	this.fechaDeConstitucion = fechaDeConstitucion;
	this.montoDepositado = montoDepositado;
	this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }
    
    public double valorActual() {
	int dias = this.getFechaDeConst().until(LocalDate.now()).getDays();
	return  this.getMontoDepositado() + (this.getPorcentaje() * dias);
    }
    
    public LocalDate getFechaDeConst(){
        return this.fechaDeConstitucion;
    }
    
    public double getMontoDepositado(){
        return this.montoDepositado;
    }
    
    public double getPorcentaje(){
        return this.porcentajeDeInteresDiario;
    }
    
    
}
