package mantenimiento;

public class Limpieza extends Servicio{
    
    private double tarifaMinima;
    
    public Limpieza(double precio, int cantHoras, double tarifaMinima){
        super(precio,cantHoras);
        this.tarifaMinima = tarifaMinima;
    }
    
    public double getTarifaMinima(){
        return this.tarifaMinima;
    }
    
    public double MontoAbonar(){
        double monto = 0;
        double suma = this.getPrecio() * this.getCantHoras();
        if(suma > this.tarifaMinima)
            monto = suma;
        else
            monto = this.tarifaMinima;
        return monto;
    }
    
}
