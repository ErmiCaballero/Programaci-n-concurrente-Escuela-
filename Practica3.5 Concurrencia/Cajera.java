package P4;

/**
 *
 * @author ADMIN
 */
public class Cajera extends Thread{
    private String nombre;
    private Cliente cliente;
    private long tiempo;
    
    public Cajera(String nombre, Cliente cliente){
        //this.nombre = nombre;
        super(nombre);
        this.cliente = cliente;
      //  this.tiempo = tiempo;
        tiempo = (int) System.currentTimeMillis();
    }
    
    public void getNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String setNombre(){
        return nombre;
    }
    
    public void proceso(){
        System.out.println("Cajera "+ Thread.currentThread().getName() + " procesando compra de "+ cliente.setName());
    }
    
    public void tiempoProceso(){
        int compras = cliente.setcompras().length;
        for(int i = 0; i < compras; i++){
            
            System.out.println("Procesando producto "+ i + " de cliente " + cliente.setName() + "| Tiempo: " + (System.currentTimeMillis()- getTiempo()/1000) + "  seg.");
        }
        System.out.println("Fin de productos compra "+ cliente.setName());
    }
    
    public long getTiempo()
    {
        return tiempo;
    }
    
    
    public void run(){
        proceso();
        tiempoProceso();
        esperar(3);
    }
    
    public void esperar(int seg){
        
        try
            {
                Thread.sleep(seg*3000);
            }
            catch(InterruptedException e)
            {
                Thread.interrupted();
            }
    }
}