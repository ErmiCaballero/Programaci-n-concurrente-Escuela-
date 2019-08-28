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
public class Hilo extends Thread
{
    private String N;
    
    public Hilo(String n)
    {
        super(n);//N es el nombre del hilo
        N = n;
    }
    
    public void arreglo1()
    {
        randArray lista = new randArray("lista1");
        lista.genRandArray();
        lista.estaLlena();
        Sort sort = new Sort();    
        sort.Sort("lista1", lista.returnArray());
        sort.bubbleSort();
        //sort.printArray();
        Eliminar eliminar = new Eliminar();
        eliminar.Eliminar("lista1", sort.returnOrdenado());
        eliminar.eliminarRepeticion();
    }
    
    public void arreglo2()
    {
        randArray lista = new randArray("lista2");
        lista.genRandArray();
        lista.estaLlena();
        Sort sort = new Sort();
        sort.Sort("lista2", lista.returnArray());
        //lista.printArray();
        sort.bubbleSort();
        Eliminar eliminar = new Eliminar();
        eliminar.Eliminar("lista2", sort.returnOrdenado());
        eliminar.eliminarRepeticion();
    }
    
    public void arreglo3()
    {
        randArray lista = new randArray("lista3");
        lista.genRandArray();
        Sort sort = new Sort();
        lista.estaLlena();
        sort.Sort("lista3", lista.returnArray());
        //lista.printArray();        
        sort.bubbleSort();
        Eliminar eliminar = new Eliminar();
        eliminar.Eliminar("lista3", sort.returnOrdenado());
        eliminar.eliminarRepeticion();
    }
    
   public void run()
   {
       switch(N)
       {
           case "hilo1" : arreglo1();
           break;
           case "hilo2" : arreglo2();
           break;
           case "hilo3" : arreglo3();
           break;   
       }
   }
}
