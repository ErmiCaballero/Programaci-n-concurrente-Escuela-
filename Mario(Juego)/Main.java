package POO;

public class Main
{
    public static void main(String args[])
    {
        Control mando1 = new Control();

        for(int i=0;i<7;i++)
            new Thread(new Jugador("Player " + i, mando1)).start();
    }
}