package POO;

public class Mario extends Personaje
{
    public Mario(int vida, String nombre) {
        super(vida, nombre);
    }

    public Mario()
    {
    }

    public void saltar()
    {
        System.out.println("Mario saltó");
    }

    public void correr()
    {
        System.out.println("Mario corrió");
    }

    public void disparar()
    {
        System.out.println("Mario disparó");
    }

    public void escalar()
    {
        System.out.println("Mario escaló");
    }
}