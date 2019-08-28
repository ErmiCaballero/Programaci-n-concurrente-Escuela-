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
public class Cliente {
    private String nombre;
    private int [] CarroCompra = {1,2,3,4};
            
    public void getNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String setName(){
        return nombre;
    }
    
    public int[] setcompras(){
        return CarroCompra;
    }
}
