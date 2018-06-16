Proceso inversion1961
	
	Definir aa,av,i,r como entero
	Definir int,vv como real
	
	av=1961
	vv=1500
	i=0
	
	escribir 'ingreese año actual'
	Leer aa
	
	r= aa-av
	Mientras i<=r Hacer
		int=vv*0.15
		vv=vv+int
		i=i+1
		
	Fin Mientras
	
	Escribir 'el valor de la inversion es : $',vv;
FinProceso
