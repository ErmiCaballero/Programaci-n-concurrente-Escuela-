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
public class Sort {

    private int n;
    private String nom;
    private int[] arrayOden;

    public void Sort(String nom, int[] array) {
        this.n = 100;
        this.arrayOden = array;
        this.nom = nom;
    }
    public void bubbleSort()
    {
        System.out.println("Ordenando " + nom);
        for(int i = n - 1; i > 1; i--)
        {
            for(int j = 0; j < i; j ++)
            {
                if(arrayOden[j] > arrayOden[j + 1])
                {
                    int varTemp = arrayOden[j];
                    arrayOden[j] = arrayOden[j+1];
                    arrayOden[j+1] = varTemp;
                }
            }
        }
        System.out.println("Fin de ordenamiento de " + nom);
        //for(int i = 0; i < n; i++)
        //{
        //    System.out.println(array[i]);
        //}   
    }
    
   /* public void shellSort()
    {
        System.out.println("Ordenando " + nom);
        int intervalo = 1;
        int temp, temp2;
        while(intervalo <= array.length /3)
        {
            intervalo = intervalo *3 +1;
            while(intervalo == 0)
            {
                for(int i = intervalo; i < arrayOden.length; i++ )
                {
                    temp = arrayOden[i];
                    temp2 = temp;
                    while(temp2 > intervalo -1 && arrayOden[temp2-intervalo] >= temp)
                    {
                        arrayOden[temp2] =arrayOden[temp2 - intervalo];
                        temp2 -= intervalo;
                    }
                    arrayOden[temp2] = temp;
                }
                intervalo = (intervalo -1) / 3;
            }
        }
        System.out.println("Fin de ordenamiento de " + nom);
    } 
    
    public void quickSort(int i, int j)
    {
        System.out.println("Ordenando " + nom);
        int low = i;
        int high = j;
        int pivote = array[i + (j - i) / 2];
        while(low < high){
            while(array[low] < pivote)
            {
                low++;
            }
            while(array[high] > pivote)
            {
                high--;
            }
            if(low <= high)
            {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low ++;
                high--;
            }
        }
        if(i < high)
        {
            quickSort(i, high);
        }
        if(low < j)
        {
            quickSort(low, j);
        }
        System.out.println("Fin de ordenamiento de " + nom);
    }*/
    
    public void printArray()
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println(arrayOden[i]);
        }        
    }   
    
    public int[] returnOrdenado()
    {
        return arrayOden;
    }
}
