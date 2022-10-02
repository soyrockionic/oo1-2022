package ejercicio9.cuentaaganchos;

public class CuentaCorriente extends Cuenta {
    
    private double descubierto;
    
    public CuentaCorriente(){
        super();
        this.descubierto = 0;
    }
    
    public CuentaCorriente(double monto, double descubierto){
        this.descubierto = -descubierto;
        this.depositar(monto);
    }
    
    public double getDescubierto(){
        return this.descubierto;
    } 
    
    public void setDescubierto(double monto){
        this.descubierto = monto;
    }
    
    public boolean puedeExtraer(double monto) {
	return (this.getSaldo() - monto) >= this.getDescubierto();
    }
    
    
}
