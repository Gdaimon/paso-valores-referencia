package pasovaloresreferencia;

public class Main {


    public static void main(String[] args) {
        
        // Paso por valor
        int numero = 4;
        System.out.println(numero);
        pasoPorValor(numero);
        System.out.println(numero);
        
        System.out.println("=======================");
        
        // Paso por referencia
        Persona personaUno = new Persona("Juan", 10);
        System.out.println("Persona Uno: "+  personaUno);
        // pasoPorReferencia(personaUno);
        // System.out.println(personaUno);
        
        Persona personaDos = personaUno;
        System.out.println("Persona Dos asignacion: "+personaDos);
        personaDos.setNombre("Pedro");
        System.out.println("Persona Uno: "+personaUno);
        System.out.println("Persona Dos cambio: "+personaDos);
        
        Persona personaTres = new Persona(personaUno.getNombre(), personaUno.getEdad());
        personaTres.setNombre("Martha");
        System.out.println("Persona Uno: "+personaUno);
        System.out.println("Persona tres: "+personaTres);
        
        
    }
    
    static void pasoPorReferencia(Persona p){
        p.setNombre("Maria");
        p.setEdad(25);
    }
    
    
    static void pasoPorValor(int n){
        n = 10;
    }
    
    
    
}
