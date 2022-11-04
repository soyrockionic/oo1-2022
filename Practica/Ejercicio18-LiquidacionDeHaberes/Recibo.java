package ejercicio18.liquidaciondehaberes;

import java.time.LocalDate;

public class Recibo {
    
    private Empleado empleado;
    private int antiguedad;
    private LocalDate fecha;
    private double montoTotal;
	
    public Recibo(Empleado empleado, int antiguedad, double montoTotal) {
	this.empleado = empleado;
	this.antiguedad = antiguedad;
	this.fecha = LocalDate.now();
	this.montoTotal = montoTotal;
    }
    
    public String toString(){
        return this.empleado + " " + this.montoTotal;
    }
	
}
