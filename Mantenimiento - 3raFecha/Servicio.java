package mantenimiento;

public abstract class Servicio {
    
    private double precio;
    private int cantHoras;
    
    public Servicio(double precio, int cantHoras){
        this.precio = precio;
        this.cantHoras = cantHoras;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public int getCantHoras(){
        return this.cantHoras;
    }
    
    public abstract double MontoAbonar();
    
}
