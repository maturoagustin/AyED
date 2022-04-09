package tp02.ejercicio2;

import tp01.ejercicio3.Estudiante;

public class TestListaEnlazadaGenerica {
	public static void main(String[] args){
		
		Estudiante e1 = new Estudiante("Felipe","Gonzales","2A","feligonza@gmail.com","123 2321");
		Estudiante e2 = new Estudiante("Juan","Perez","1A","asdasd@gmail.com","13 1321");
		Estudiante e3 = new Estudiante("Agustin","Gonzales","1B","gonza@gmail.com","123 2321");
		Estudiante e4 = new Estudiante("Luis","Rodriguez","2A","gdfgdfg@gmail.com","243 2721");
		
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<Estudiante>();
	
		lista.agregarFinal(e1);
		lista.agregarFinal(e2);
		lista.agregarFinal(e3);
		lista.agregarFinal(e4);
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo().tusDatos()+" ");
		}

		/*
		//prueba 2.4
		Estudiante[] vector = new Estudiante[4];
		
		vector[0]=e1;
		vector[1]=e2;
		vector[2]=e3;
		vector[3]=e4;
		
		lista.agregar(vector);
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo().tusDatos()+" ");
		}
		*/
		
	}
}
