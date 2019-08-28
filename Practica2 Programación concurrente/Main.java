/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author ADMIN
 */
public class Main 
{
   public static void main(String[] args ) throws Exception 
   {
       Hilo hilo1 = new Hilo("hilo1");
       Hilo hilo2 = new Hilo("hilo2");   
       Hilo hilo3 = new Hilo("hilo3");  
       
       hilo1.start();
       hilo2.start();
       hilo3.start();
    }
   }
