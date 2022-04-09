package tp02.ejercicio4;

import java.util.Scanner;
import tp02.ejercicio3.PilaGenerica;

public class TestBalanceo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PilaGenerica<Character> p = new PilaGenerica<Character>();
		
		System.out.println("Ingrese una cadena haciendo uso solo de los caracteres: \"()[]{}\" ");
		String cadena = s.next();
		
		boolean balanceado = true;
		int indice = 0;
		
		while((balanceado)&&(indice < cadena.length())) {
			char caracter= cadena.charAt(indice);
			
			if(caracter == '(' || caracter == '[' || caracter == '{') {
				p.apilar(caracter);
			}
			else {
				if(p.esVacia()) { //si hay algo distinto a apertura y no hay nada apilado
					balanceado = false;
				}
				else {
					char aux = p.desapilar();
					switch(caracter) { //comparo con el ultimo apilado para comprobar si es correcto
						case ')':
							if (aux != '(')
								balanceado = false;
							break;
						case ']':
							if (aux != '[')
								balanceado = false;
							break;
						case '}':
							if (aux != '{')
								balanceado = false;
							break;
						default: //en caso de que haya otro caracter
							balanceado = false;
					}
				}
			}
			indice++;
		}
		System.out.println("Balanceado = " + balanceado);
		
	} //main
	
}//clase
