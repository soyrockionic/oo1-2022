package ejercicio7.methodlookup;


public class EmpleadoJerarquico extends Empleado {
    
    public EmpleadoJerarquico(String nombre) {
        super(nombre);
    }
    
    public double MontoBasico(){
        return 45000;
    }
    
    public double BonoPorCategoria(){
        return 8000;
    }
    
    public double SueldoBasico(){
        return super.SueldoBasico() + this.BonoPorCategoria();
    }
    
    
}
