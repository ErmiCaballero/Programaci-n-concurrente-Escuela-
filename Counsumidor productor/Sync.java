public class Sync
{
    private String tema = null;

    synchronized String aprender()
    {
        String tarea_de_moodle;
        while(tema == null)
        {
            try
            {
                wait(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        tarea_de_moodle = tema;
        tema = null;
        notifyAll();
        return tarea_de_moodle;
    }

    synchronized void enseñar(String tema_nuevo)
    {
        while(tema != null)
            try
            {
                wait(2000);
            }
            catch (Exception e){System.out.println(e);}
        tema = tema_nuevo;
        notifyAll();
    }
}
