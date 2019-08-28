public class Alumno extends Thread
{
    private String tarea;
    private String nombre;
    private Sync sync;

    public Alumno(String nombre, Sync s)
    {
        super(nombre);
        this.nombre = nombre;
        sync = s;
        tarea = "";
    }

    public void run()
    {
        tarea = sync.aprender();

        System.out.println(nombre + " hace tarea de " + tarea);

        try
        {
            Alumno.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(nombre + " subió tarea de " + tarea + " a moodle");
    }
}