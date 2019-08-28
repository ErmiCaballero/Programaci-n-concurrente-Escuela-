package POO;

public class Boton
{
    private Mario player = new Mario(100, "Mario");

    public void activarSaltar()
    {
        player.saltar();
    }

    public void activarCorrer()
    {

        player.correr();
    }

    public void activarDisparar()
    {
        player.disparar();
    }

    public void activarEscalar()
    {
        player.escalar();
    }
}
