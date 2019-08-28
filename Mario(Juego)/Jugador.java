package POO;

import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Jugador extends Persona
{
    private static final Semaphore disponibilidad = new Semaphore(1);
    private Control control;

    public Jugador(String nombre, String apellido, char sexo, Control control) {
        super(nombre, apellido, sexo); //Los toma del constructor del padre
        this.control = control;
    }

    public Jugador(String nombre ,Control control)
    {
        super(nombre);
        this.control = control;
    }

    public void setMiControl(Control miControl)
    {
        this.control = miControl;
    }

    public void botonPrecionadoX()
    {
        control.precionarBotonX(control.getBtn_x());
    }

    public void botonPrecionadoY()
    {
        control.precionarBotonY(control.getBtn_y());
    }

    public void botonPrecionadoO()
    {
        control.precionarBotonO(control.getBtn_o());
    }

    public void botonPrecionadoQ()
    {
        control.precionarBotonQ(control.getBtn_q());
    }

    public void run()
    {

        try
        {
            disponibilidad.acquire();

            int randNumber = (int) (Math.random() * 4) + 1;

            switch (randNumber)
            {
                case 1:
                    System.out.print(super.getNombre()+ " Juega: ");
                    botonPrecionadoX();
                    break;
                case 2:
                    System.out.print(super.getNombre()+ " Juega: ");
                    botonPrecionadoY();
                    break;
                case 3:
                    System.out.print(super.getNombre()+ " Juega: ");
                    botonPrecionadoO();
                    break;
                case 4:
                    System.out.print(super.getNombre()+ " Juega: ");
                    botonPrecionadoQ();
                    break;
                default:
                    return;
            }
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println(this.getNombre()+ " deja control");
        System.out.println();
        disponibilidad.release();
    }
}