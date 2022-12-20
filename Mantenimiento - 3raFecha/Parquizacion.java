package mantenimiento;

public class Parquizacion extends Servicio{
    
    private int cantMaq;
    private double costoPorMaq;
    
    public Parquizacion(double precio, int cantHoras, int cantMaq, double costoPorMaq){
        super(precio,cantHoras);
        this.cantMaq = cantMaq;
        this.costoPorMaq = costoPorMaq;
    }
    
    public int getCantMaq(){
        return this.cantMaq;
    }
    
    public double getCostoPorMaq(){
        return this.costoPorMaq;
    }
    
    public double MontoAbonar(){
        return (this.getPrecio()*this.getCantHoras()) + (this.costoPorMaq*this.cantMaq);
    }
    
}
