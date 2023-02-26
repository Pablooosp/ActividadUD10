package evaluableud10;

public class PruebaAlumno {

	public static void main(String[] args) {
		
		Alumno a = new Alumno("Julia", "DAM DUAL", 6);
		Alumno b = new Alumno("Marcos", "DAWE");
		Alumno c = new Alumno("Lucas");
		
		for(int i=0; i<a.notasLength().length ; i++) {
			a.cambiarNota(i, (int)(Math.random()*6)+4);
		}
		for(int i=0; i<b.notasLength().length ; i++) {
			b.cambiarNota(i, (int)(Math.random()*6)+4);
			c.cambiarNota(i, (int)(Math.random()*6)+4);
		}
		System.out.println("***NOTAS***");
		System.out.println(a.getNotas());
		System.out.println(b.getNotas());
		System.out.println(c.getNotas());
		
		//METODOS A
		System.out.println("***METODOS A***");
		System.out.println(a.calcularMedia());
		a.cambiarAsignaturas(7);
		for(int i=0; i<a.notasLength().length ; i++) {
			a.cambiarNota(i, (int)(Math.random()*6)+4);
		}
		System.out.println(a.getNotas());
		System.out.println(a.calcularMedia());
		
		//METODOS B
		System.out.println("***METODOS B***");
		System.out.println(b.todasAprobadas());
		System.out.println(b.notaespecifica(4));
		
		//METODOS C
		System.out.println("***METODOS C***");
		System.out.println(c.getNotas());
		c.cambiarNota(1, 4);
		System.out.println(c.getNotas());
	}

}
