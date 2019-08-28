package POO;

public class Personaje
{
    private int vida;
    private String nombre;

    public Personaje(int vida, String nombre) {
        this.vida = vida;
        this.nombre = nombre;
    }

    public Personaje()
    {
        vida = 3;
        nombre = "Mario";
    }
}
