
public class Uno {
	public static void main(String[] args) { 
		System.out.println("FOR:");
		imprimirFor(0, 15);
		System.out.println("WHILE:");
		imprimirWhile(0, 15);
		System.out.println("SIN ITERACION:");
		imprimirSinIte(0, 15);
	}
	
	public static void imprimirFor(int a,int b) {
		int i;
		for (i=a;i<=b;i++) {
			System.out.println(i);
		}
	}
	
	public static void imprimirWhile(int a, int b) {	
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void imprimirSinIte(int a,int b) {
		System.out.println(a);
		if(a<b) {
			a++;
			imprimirSinIte(a,b);
		}
	}
}
