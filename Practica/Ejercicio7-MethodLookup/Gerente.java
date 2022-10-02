package ejercicio7.methodlookup;


public class Gerente extends EmpleadoJerarquico{

    public Gerente(String nombre) {
        super(nombre);
    }
    
    public double MontoBasico(){
        return 57000;
    } 
    
    public double Aportes(){
        return this.MontoBasico() * 0.05d;
    }
    
    
}
