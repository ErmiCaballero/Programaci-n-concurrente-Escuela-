package POO;

public class Control
{
    private Boton btn_x;
    private Boton btn_y;
    private Boton btn_o;
    private Boton btn_q;
    private Mario player1;
    private Boton n;

    public Control()
    {
    }

    public void precionarBotonX(Boton n)
    {
        n = new Boton();
        n.activarCorrer();
        System.out.println("Se presionó Boton 'X'");
    }

    public void precionarBotonY(Boton n)
    {
        n = new Boton();
        n.activarSaltar();
        System.out.println("Se presionó Boton 'Y'");
    }

    public void precionarBotonO(Boton n)
    {
        n = new Boton();
        n.activarDisparar();
        System.out.println("Se presionó Boton 'O'");
    }

    public void precionarBotonQ(Boton n)
    {
        n = new Boton();
        n.activarEscalar();
        System.out.println("Se presionó Boton 'Q'");
    }

    public Boton getBtn_x()
    {
        return btn_x;
    }
    public Boton getBtn_y()
    {
        return btn_y;
    }
    public Boton getBtn_o()
    {
        return btn_o;
    }
    public Boton getBtn_q()
    {
        return btn_q;
    }

}
