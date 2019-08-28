/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.getNombre("Ermi");
        
        Cliente cliente2 = new Cliente();
        cliente2.getNombre("Christian");
        
        Cajera cajera1 = new Cajera("Lola", cliente1);   
        Cajera cajera2 = new Cajera("Carla", cliente2);
        
        cajera1.start();
        cajera2.start();
    }
    
}
