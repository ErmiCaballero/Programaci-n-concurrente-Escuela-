package POO;

import java.util.Date;

public class Persona implements Runnable
{
    private String nombre;
    private String apellido;
    private char Sexo;

    public Persona(String nombre, String apellido, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        Sexo = sexo;
    }

    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public Persona()
    {
        nombre = "Ermi";
        apellido = "Caballero";
        Sexo = 'm';
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public void run()
    {

    }
}
