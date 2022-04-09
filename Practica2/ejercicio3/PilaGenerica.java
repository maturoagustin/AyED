package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T> {
	ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void apilar(T t) {
		datos.agregarInicio(t);
	}

	public T desapilar() {
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
