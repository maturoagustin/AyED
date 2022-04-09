package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ColaGenerica<T> {
	ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T t) {
		datos.agregarFinal(t);
	}

	public T desencolar() {
		T aux = datos.elemento(1);
		datos.eliminarEn(1);
		return aux;
	}
	
	public T tope() {
		T aux = datos.elemento(1);
		return aux;
	}
	
	public boolean esVacia() {
		return datos.esVacia();
	}
}
