public class Aula
{
    public static void main(String[] args)
    {
        Sync sync = new Sync();

        Maestro maestro = new Maestro(sync);

        maestro.start(); //Productor

        Alumno alumno [] = {new Alumno("Ermi", sync), new Alumno("Christian", sync),
                new Alumno("Carlos", sync), new Alumno("Otero", sync), new Alumno("Cesar", sync)};
        for(int a = 0; a < alumno.length; a++)
        {
            alumno[a].start();
        }
    }
}