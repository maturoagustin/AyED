
public class Cinco {
	//CONSIGNA A)
	public static int[] devolverConReturn(int[] a){
		int[] res = new int[3]; 
		res[0] = -99999; //para el maximo
		res[1] = 99999; //para el minimo
		res[2] = 0; //para el promedio (no tan exacto por ser int)
		
		int i,total=0;
		for(i = 0;i < a.length;i++) {
			if(a[i] >= res[0]) {
				res[0] = a[i];
			}
			if(a[i] <= res[1]) {
				res[1] = a[i];
			}
			total += a[i];
		}
		res[2] = total/a.length;
		return res;
	}
	
	//CONSIGNA B)
	public static void devolverConParametro(int[] a,Resultados res) {
		int i,total=0;
		for(i = 0;i < a.length;i++) {
			if(a[i] >= res.getMax()) {
				res.setMax(a[i]);
			}
			if(a[i] <= res.getMin()) {
				res.setMin(a[i]);
			}
			total += a[i];
		}
		res.setProm((double)total/a.length);
	}
	
	//CONSIGNA C)
	private static int maxC=-99999,minC=99999; //Variables globales en la clase
	private static double promC = 0;
	
	public static void devolverSin(int[] a) {
		int i,total=0;
		for(i = 0;i < a.length;i++) {
			if(a[i] >= maxC) {
				maxC = a[i];
			}
			if(a[i] <= minC) {
				minC = a[i];
			}
			total += a[i];
		}
		promC = (double)total/a.length;
	}
	
	public static void main(String[] args) {
		int[] arreglo = {1,2,30,4,5,-6,7,8,9};
		int[] resA = new int[3];
		Resultados resB = new Resultados();
		
		System.out.println("\n Consigna A: ");
		resA = devolverConReturn(arreglo);
		System.out.println("Max: "+resA[0]+" | Min: "+resA[1]+" | Prom: "+resA[2]);
		
		System.out.println("\n Consigna B: ");
		devolverConParametro(arreglo,resB);
		System.out.println("Max: "+resB.getMax()+" | Min: "+resB.getMin()+" | Prom: "+resB.getProm());
		
		devolverSin(arreglo);
		System.out.println("Consigna C: ");
		System.out.println("Max: "+maxC+" | Min: "+minC+" | Prom: "+promC);
		
		
	}
}
