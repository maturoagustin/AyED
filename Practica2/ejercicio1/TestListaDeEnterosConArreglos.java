package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		for(int i=1;i <= args.length ; i++ ) {
			lista.agregarEn(Integer.parseInt(args[i]),i);
		}
		if (!lista.esVacia()) {
			lista.comenzar();
			while(!lista.fin()) {
				System.out.print(lista.proximo()+" " );
			}
	}
		
	}

}
