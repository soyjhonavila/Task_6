 package task_6;
 import java.io.*;
 public class p_1 
{

    public static void main(String[] args) throws NumberFormatException, IOException 
   {
		
		BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Digite tamaño del arreglo");
		
		int T = Integer.parseInt(leer.readLine());
		System.out.println("Escriba los numeros dentro del arreglo");
		String N1 = leer.readLine();
		String N2 [] = N1.split(",");
		System.out.println("Digite el numero de la diferencia");
		
		int D = Integer.parseInt(leer.readLine());
		int cont = 0;
		
		for (int i = 0; i < N2.length ; i++) 
	   {
		   for (int j = 0 ; j < N2.length ; j++) 
		  {	
			   int a = Integer.parseInt(N2[i]);
			   int b = Integer.parseInt(N2[j]);
			   int c = (a - b);
				
			   if(Math.abs(c) == Math.abs(D))
			  {
					cont += 1;
					String Pareja = "(" + N2[i] + " , " + N2[j] + ")";
					System.out.println(Pareja);
			  }
		   }	
		}
		int cont1=cont/2;
		
		System.out.println("El total de parejas con diferencia es " + cont1);

	}
	
}
