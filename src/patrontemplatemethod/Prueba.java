/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrontemplatemethod;

/**
 *
 * @author Hugo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Cliente(12121);
        System.out.println("El cliente dice");
        System.out.println(p.identificate());
        
        p = new Empleado("AD 41252");
        System.out.println("El empleado dice");
        System.out.println(p.identificate());
        
        
        p = new Socio(46232);
        System.out.println("El socio dice");
        System.out.println(p.identificate());
        
    }
    
}
