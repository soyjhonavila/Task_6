 package task_6;
 import java.util.*;
 public class p_2 
{
     public static void main(String[] args) 
    {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite tamaño para el arreglo");
        int tamaño = leer.nextInt();
        int Array [] = new int [tamaño];
        int Array2[] = new int [tamaño];
        
        for (int i = 0; i < Array.length; i++) 
       {
            Array[i] = leer.nextInt();    
       }
        
        for (int i = 0; i < Array.length ; i++) 
       {
           int Valor = 1;
           for (int j = 0; j < Array.length; j++) 
          {
                
              if(i!=j)
             {
                   Valor *= Array[j];
                   Array2[i] = Valor;   
             }  
          } 
       }
        for (int x = 0; x < Array2.length; x++) 
       {             
        	System.out.println(Array2[x]);           
       }
    }
	
	
}
