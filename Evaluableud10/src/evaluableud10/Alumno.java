package evaluableud10;

import java.util.Arrays;

public class Alumno {
	
	private String nombre;
	private String curso;
	private int[] notas;
	
	public Alumno(String nombre, String curso, int asignaturas) {
		this.nombre = nombre;
		this.curso = curso;
		this.notas= new int [asignaturas];
	}
	public Alumno(String nombre, String curso) {
		this(nombre, curso, 5);
	}
	public Alumno(String nombre) {
		this(nombre, "DAM");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int[] notasLength() {
		return notas;
	}
	public String getNotas() { //metodo para devolver las notas en tipo String
		return Arrays.toString(notas);
	}
	
	public void cambiarNota(int asignatura, int notanueva) { //metodo para cambiar una nota especifica
		if(asignatura >=0 && asignatura < notas.length) { //if que comprueba que la asignatura puesta en parametro sea valida
			notas[asignatura] = notanueva;
		}
		else
			System.out.println("El numero de la asignatura no es valido");
	}
	
	public double calcularMedia() { //metodo que calcula la media del alumno
		double total = 0;
		for(int i : notas) {
			total += i;
		}
		return total / notas.length;
	}
	
	public boolean todasAprobadas() { //metodo que devuelve un true or false dependiendo de si las todas las notas son superiores a 5 o no
		for(int i : notas) {
			if(i < 5) {
				return false;
			}
		}
		return true;
	}
	
	public int notaespecifica(int asignatura) { //metodo que devuelve la nota de una asignatura en particular
		return notas[asignatura];
	}
	
	public void cambiarAsignaturas(int asignaturas) { //metodo que cambia el numero de asignaturas que hay
		this.notas= new int[asignaturas];
	}
	
	@Override
	public String toString() { //toString
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
}
	
