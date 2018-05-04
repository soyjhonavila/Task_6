 package task_6;
 import java.io.*;
 public class p_4 
{
	static BufferedReader leer = new BufferedReader ( new InputStreamReader (System.in));
	static BufferedWriter escribir = new BufferedWriter ( new OutputStreamWriter (System.out));
	    
    public static void main(String[] args) throws IOException 
   {
	   
	   int [] dias = new int [7];
	   escribir.write (" ingrese los precios por día");
	   escribir.flush();

	   int i;
	   for (i = 0; i < dias.length; i++) 
	  { 
		 int valor = Integer.parseInt(leer.readLine() );
		 dias[i] = valor;
	  }
	   int Menor = dias[0];
	   int Mayor = dias[0];
	   int diferencia=0;
	 
	   for (int j = 0; j < dias.length; j++) 
	  {	
	       if(dias[j] < Menor)
	      {	 
		    Menor = dias[j];
		  }
	  }
	   escribir.write(Menor);
	   escribir.flush();
	 
	   for (int x = 0; x < dias.length; x++) 
	  {	 
		  if(dias[x] > Mayor)
		 {
	         Mayor = dias[x];
		 }		  
      }

	     System.out.println(Mayor);
	 
	     diferencia = Mayor - Menor;
	 
	     escribir.write("La ganancia es de " + diferencia); 
	     escribir.flush();
   }
}
