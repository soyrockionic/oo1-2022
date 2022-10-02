package ClienteDeCorreoTest;

import ejercicio13.clientedecorreo.Archivo;
import ejercicio13.clientedecorreo.Carpeta;
import ejercicio13.clientedecorreo.ClienteDeCorreo;
import ejercicio13.clientedecorreo.Email;

public class ClienteDeCorreoTest {
    
    public static void main(String[] args){
        
        ClienteDeCorreo cliente = new ClienteDeCorreo();
        
        Email email = new Email("Hola","Como estan");
        
        Archivo a1 = new Archivo("Primer archivo");
        Archivo a2 = new Archivo("Segundo archivo");
        
        email.agregarAdjuntos(a1);
        email.agregarAdjuntos(a2);
        
        Carpeta c1 = new Carpeta("Carpeta1");
        c1.agregarMail(email);
        cliente.agregarCarpeta(c1);
        
        Carpeta c2 = new Carpeta("Carpeta2");
        cliente.agregarCarpeta(c2);
        
        Email inbox = new Email("Holaa","Soy un inbox");    
        cliente.recibir(inbox);
     
        System.out.println(cliente.getInbox().getEmails().get(0).getCuerpo());
        System.out.println(cliente.buscar("Hola").getCuerpo());
        cliente.mover(email, c1, c2);
        System.out.println(cliente.getCarpetas().get(2).getEmails().get(0).getTitulo());
        System.out.println(cliente.espacioOcupado());
    }
    
}
