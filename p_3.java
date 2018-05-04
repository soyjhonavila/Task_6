 package task_6;
 import java.util.*;
 public class p_3 
{
	public static void main(String[] args) 
   {	
	   Scanner leer = new Scanner (System.in);
	   System.out.println("Digite tamaño del arreglo");
	   int Tamaño = leer.nextInt();
	   int T [] = new int[Tamaño];
		
	   System.out.println("Escriba los numeros dentro del arreglo");
		
	   for (int i = 0; i <  T.length; i++) 
	  {	
	   T[i] = leer.nextInt(); 	
	  }
		int Aux = 0;
		
		for (int i = 0; i < T.length; i++) 
	   {
			for (int j = 0; j < T.length; j++) 
		   {	
				if(!(T[i] == T[j]))
			   {	
				   Aux = T[j];	
			   }
		   }		
	   }
		 System.out.println("El Numero que no se repite es "	+ Aux);
   }
}
