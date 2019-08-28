/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class Eliminar {
    private String nom;
    private int[] array;
    private int n;
    public void Eliminar(String nom, int[] array)
    {
        this.nom = nom;
        this.array = array;
        n = 0;
    }
    
    public void eliminarRepeticion()
    {
        System.out.println("Repetidos eliminados " + nom);
        
        int arregloRandLen = array.length;
        for(int i = 0; i < arregloRandLen; i++)
        {
            for(int j = i + 1; j < arregloRandLen; j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println(nom +" : "+ array[j]);
                    array[j] = array[arregloRandLen - 1];
                    arregloRandLen --;
                    j--;
                }
            }
        }
        System.out.println("Quedan "+ arregloRandLen+ " elementos en la lista "+ nom);        
    }
}