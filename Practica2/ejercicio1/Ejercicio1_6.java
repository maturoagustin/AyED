package tp02.ejercicio1;

public class Ejercicio1_6 {
	
	public ListaDeEnterosEnlazada calcularSucesion (int n) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		System.out.print(n + " ");
		int x;
		if (n != 1) {
			if(n % 2 == 0) {
				x = n/2;
				l = calcularSucesion(x);
				l.agregarInicio(n);
			}
			else {
				x = 3 * n + 1;
				l = calcularSucesion(x);
				l.agregarInicio(n);
			}
		}
		else {
			l.agregarInicio(n); //agrega el 1
		}
		
		return(l);
	}
	
	public static void main(String[] args) {
		
		Ejercicio1_6 f = new Ejercicio1_6();
		ListaDeEnterosEnlazada l = f. calcularSucesion(6);
		
		l.comenzar();
		while(!l.fin()) {
			System.out.print(l.proximo()+" ");
		}
		
	}


}


