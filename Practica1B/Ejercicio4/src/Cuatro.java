//EL EJERCICIO CONSISTE EN PROBAR UN PROGRAMA YA HECHO
/*
 * Sin probarlo, creo que en el primer metodo no varia los valores porque toma 
 * los parametros por valor y en el 2do metodo no varía porque se usan wrapps los cuales son 
 * inmutables (al asignarle otro valor, crea otra direccion diferente)
*/
public class Cuatro{
		public static void main(String[] args) {
			int a = 1, b = 2;
			Integer c = 3, d = 4;
			Swaps.swap1(a,b);
			Swaps.swap2(c,d);
			System.out.println("a=" + a + " b=" + b) ;
			System.out.println("c=" + c + " d=" + d) ;
		}

public class Swaps {
	public static void swap1 (int x, int y) {
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}
	public static void swap2 (Integer x, Integer y) {
		if (x < y) {
			int tmp = x ;
			x = y ;
			y = tmp;
		}
	}
}


}
