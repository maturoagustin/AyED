package tp02.ejercicio1;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args ) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		for(int i=0;i < args.length ; i++ ) {
			lista.agregarFinal(Integer.parseInt(args[i]));
		}
		lista.comenzar();
		while(!lista.fin()) {
			System.out.print(lista.proximo()+" ");
		}
		System.out.println();
		//punto 1.5
		lista.comenzar();
		lista.sentidoInverso();
	}
	
	
}
