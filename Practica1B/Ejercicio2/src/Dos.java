/*
2. Escriba un método de clase que dado un número n devuelva un nuevo arreglo de
tamaño n con los n primeros múltiplos enteros de n mayores o iguales que 1.
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k}
Agregue al programa la posibilidad de probar con distintos valores de n
ingresándolos por teclado, mediante el uso de System.in. La clase Scanner permite
leer de forma sencilla valores de entrada
*/
import java.util.Scanner;

public class Dos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] vec = new int[num];
		vec = multiplos(num);
		
		int i;
		for(i=0;i<num;i++) {
			System.out.println(vec[i]);
		}
	}
	
	public static int[] multiplos(int n) {
		int[] arreglo = new int[n]; 
		int i;
		
		for (i=0;i<n;i++) {
			arreglo[i]=n*(i+1);
		}
		return arreglo;
	}
}