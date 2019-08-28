/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author ADMIN
 */
public class randArray {
    private int[] arrayNum;
    int n;
    String nom;

    public randArray(String nom) {
        this.arrayNum = new int [100];
        n = 100;
        this.nom = nom;
        
    }
    public void genRandArray()
    {
        for(int i = 0; i < n; i++)
        {
            arrayNum[i] = (int) (Math.random()*100)+1;
        }
    }
    public void printArray()
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println(arrayNum[i]);
        }        
    }   
    
    public void estaLlena()
    {
        System.out.println(nom + " está llena:");
    }

    /**
     *
     * @return
     */
    public int[] returnArray()
    {
        return arrayNum;
    }
}
