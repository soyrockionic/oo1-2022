package ejercicio6.reddealumbrado;


public class RedDeAlumbradoTest {

    
    public static void main(String[] args) {
        
        Farola farolaUno = new Farola();
	Farola farolaDos = new Farola();
        
        farolaUno.pairWithNeighbor(farolaDos);
        System.out.println(farolaUno.getNeighbors().contains(farolaDos));
        System.out.println(farolaDos.getNeighbors().contains(farolaUno));
        
        System.out.println();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
        farolaUno.turnOn();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
        farolaUno.turnOff();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
        System.out.println();
        farolaDos.turnOn();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
        farolaDos.turnOff();
        System.out.println(farolaUno.isOn());
        System.out.println(farolaDos.isOn());
        
    }
    
}
