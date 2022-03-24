
public class Test {

	public static void main(String[] args) {
		Estudiante[] est = new Estudiante[2];
		Profesor[] prof = new Profesor[3];

		est[0] = new Estudiante("Felipe","Gonzales","2A","feligonza@gmail.com","123 2321");
		est[1] = new Estudiante("Juan","Rodriguez","1C","juanrodri@gmail.com","15 1424");
		
		prof[0] = new Profesor("Carlos","Perez","carlosperez@gmail.com","catedra1","Informatica");
		prof[1]= new Profesor("Miguel","Lopez","milo@hotmail.com","catedra2","Ciencias exactas");
		prof[2] = new Profesor("Luis","Fernandez","lufer@gmail.com","catedra3","Ingenieria");
	
		int i;
		for(i=0;i<2;i++) {
			System.out.println(est[i].tusDatos());
		}
		
		for(i=0;i<3;i++) {
			System.out.println(prof[i].tusDatos());
		}
	}

}
