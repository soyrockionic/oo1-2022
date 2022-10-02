package ejercicio7.methodlookup;


public class Empleado {
    
    private String nombre;
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public double MontoBasico(){
        return 35000;
    }
    
    public double Aportes(){
        return  13500;
    }
    
    public double SueldoBasico(){
        return this.MontoBasico() + this.Aportes();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
}
