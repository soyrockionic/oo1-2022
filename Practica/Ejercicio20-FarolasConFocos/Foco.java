package ejercicio20.farolasconfocos;

public class Foco {

    private String fabricante;
    private int cantidadDeCiclos;
	
    public Foco(String fabricante, int cantidadDeCiclos) {
	this.fabricante = fabricante;
	this.cantidadDeCiclos = cantidadDeCiclos;
    }

    public void descontarCantidadDeCiclos() {
	this.cantidadDeCiclos--;
    }
	
    public boolean estaVencido() {
	return this.cantidadDeCiclos < 1;
    }

    public String getFabricante() {
	return fabricante;
    }
    
    public String toString(){
        return this.fabricante + " Cant. Ciclos " + this.cantidadDeCiclos;
    }

}