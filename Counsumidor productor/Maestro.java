public class Maestro extends Thread
{
    private Sync sync;
    private String respuesta = null;
    private String palabra;
    private String[] tareas = {"Semaforo", "Monitor", "Hilo", "Proceso", "Sincronización"};
    //private int t = 0;

    public Maestro(Sync s)
    {
        sync = s;
    }

    public void run()
    {
        for(int i = 0; i < tareas.length; i ++)
        {
            respuesta = elegirTema(i);
            sync.enseñar(respuesta);
            System.out.println("*Maestro subió tarea de " + respuesta + " a moodle.");
        }
    }

    public String elegirTema(int i)
    {
        palabra = tareas[i];
        return palabra;
    }
}
