package casopractico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Supermercado2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cesta = new ArrayList<>();
		TreeSet<String> productos = new TreeSet<>();
		//Se meten los productos en el TreeSet
		productos.add("Tomate");
		productos.add("Leche");
		productos.add("Pan");
		productos.add("Aceite");
		productos.add("Champu");
		productos.add("Patatas");
		productos.add("Manzanas");
		productos.add("Papel");
		productos.add("Jamon");
		productos.add("Vinagre");
		productos.add("Cereales");
		productos.add("Naranjas");
		productos.add("Lubina");
		productos.add("Carne");
		productos.add("Harina");
		productos.add("Yogur");
		productos.add("Helados");
		productos.add("Limon");
		productos.add("Tostadas");
		productos.add("Napolitana");
		productos.add("Batido");
		
		acceso();
		System.out.println("Que quieres hacer?");
		int respuestaacceso = sc.nextInt();
		//While que entra siempre que la respuesta no sea ni 1 ni 2
		while(!(respuestaacceso==1) && !(respuestaacceso==2)) {
			System.out.println("Respuesta no valida");
			respuestaacceso = sc.nextInt();
		}
		//Un if que entra si la respuesta es 1
		if(respuestaacceso==1) {
			final String contrasena = "J4v4d0n4";
			String clave = "";
			System.out.println("Introduce la contrasena: ");
			for(int i=1;i<=4 && !clave.equals(contrasena);i++) {
				if(!(clave==""))
					System.out.println("Introduce la contrasena:");
					clave = sc.nextLine();
				if(clave.equals(contrasena)) {
					System.out.println("Contrasena correcta");
					menupersonal();
					System.out.println("Que quieres hacer?");
					int respuesta2 = sc.nextInt();
					while(!(respuesta2==5)) {
						while(!(respuesta2==1) && !(respuesta2==2) && !(respuesta2==3) && !(respuesta2==4) && !(respuesta2==5)) {
							System.out.println("Respuesta no valida");
							respuesta2 = sc.nextInt();
						}
						switch(respuesta2) {
						case 1:
							System.out.println(productos);
							menupersonal();
							System.out.println("Que quieres hacer?");
							respuesta2 = sc.nextInt();
							break;
						case 2:
							System.out.println("Escribe los articulos tal cual se muestran en  la lista y escriba 'fin' cuando haya terminado");
							String compra2 = sc.nextLine();
							while(!compra2.contains("fin")) {
								compra2 = sc.nextLine();
								if(!compra2.equals("fin")) {
									if(!productos.contains(compra2)) {
											productos.add(compra2);
									}
									else
										System.out.println("Ese producto ya esta en el supermercado");
								}
								else {
									System.out.println("Productos añadidos");
									menupersonal();
									System.out.println("Escoga una opcion: ");
									respuesta2 = sc.nextInt();
								}
							}
							break;
						case 3:
							System.out.println("Que producto quieres eliminar?");
							String eliminar2;
							eliminar2= sc.nextLine();
							if(eliminar2.isEmpty())
								eliminar2 = sc.nextLine();
							if(productos.contains(eliminar2)) {
								productos.remove(eliminar2);
							}
							else
								System.out.println("No se puede eliminar ya que no esta en el supermercado");
							menupersonal();
							System.out.println("Que quieres hacer?");
							respuesta2 = sc.nextInt();
							break;
						case 4:
							System.out.println("Que producto quieres modificar?");
							String modificar;
							String modificacion;
							modificar = sc.nextLine();
							if(modificar.isEmpty())
								modificar = sc.nextLine();
							if(productos.contains(modificar)) {
								productos.remove(modificar);
								System.out.println("Escribe el producto modificado");
								modificacion = sc.nextLine();
								productos.add(modificacion);
							}
							else
								System.out.println("No se puede modificar porque no esta en el supermercado");
							menupersonal();
							System.out.println("Que quieres hacer?");
							respuesta2 = sc.nextInt();
							break;
						}
					}
				}
				else {
					if(!(clave==""))
						System.out.println("Contrasena incorrecta te quedan "+(4-i)+" intentos");
				}
			}
		}
		//Creamos if en el que se entra si la respuesta del menu de acceso es 2
		if(respuestaacceso==2) {
			menucliente();
			
			System.out.println("Que quieres hacer?");
			int respuesta = sc.nextInt();

			while(!(respuesta==6)) {
				while(!(respuesta==1) && !(respuesta==2) && !(respuesta==3) && !(respuesta==4) && !(respuesta==5) && !(respuesta==6)) {
					System.out.println("Respuesta no valida");
					respuesta = sc.nextInt();
				}
				switch(respuesta) {
				case 1:
					System.out.println(productos);
					menucliente();
					System.out.println("Escoga una opcion: ");
					respuesta = sc.nextInt();
					break;
				case 2:
					System.out.println("Escriba los prodcutos que quieras meter en la cesta separados por ',': ");
					String cestacliente = sc.nextLine();
					if(cestacliente.isEmpty())
						cestacliente = sc.nextLine();
					String [] aux = cestacliente.split(",");
					for(int i=0; i<aux.length; i++) {
						if(productos.contains(aux[i])) {
							cesta.add(aux[i]);
						}
						else
							System.out.println(aux[i] + " no esta disponible en el supermercado");
					}
					menucliente();
					System.out.println("Que quieres hacer?");
					respuesta = sc.nextInt(); 
					break;
				case 3:
					System.out.println(cesta);
					menucliente();
					System.out.println("Que quieres hacer?");
					respuesta = sc.nextInt(); 
					break;
				case 4:
					System.out.println("Que producto quieres consultar si esta en su carrito: ");
					String consulta = sc.nextLine();
					if(consulta.isEmpty())
						consulta = sc.nextLine();
					if(cesta.contains(consulta)) {
						System.out.println("El producto seleccionado se encuentra en su carrito");
					}
					else
						System.out.println("El producto seleccionado no se encuentra en su carrito");
					menucliente();
					System.out.println("Que quieres hacer?");
					respuesta = sc.nextInt();
					break;
				case 5:
					System.out.println("Que producto quieres eliminar: ");
					String eliminar = sc.nextLine();
					if(eliminar.isEmpty())
						eliminar = sc.nextLine();
					if(cesta.contains(eliminar)) {
						cesta.remove(eliminar);
						System.out.println("Que producto quieres añadir: ");
						String cambio = sc.nextLine();
						if(productos.contains(cambio)) {
								cesta.add(cambio);
						}
						else
							System.out.println("Ese producto no esta en el supermercado");
					}
					else
						System.out.println("Ese producto no esta en la cesta");
					menucliente();
					System.out.println("Escoga una opcion: ");
					respuesta = sc.nextInt();
					break;
				}
			}
		}
		
		
		
	}
	//Funciones para llamar mas sencillamente a los menus
public static void acceso() {
	System.out.println("********** ACCESO *******\n1. Personal del supermercado\n2. Cliente");
}
public static void menupersonal() {
	System.out.println("********** MENÚ *******\n1. Mostrar productos del supermercado\n2. Añadir productos\n3. Eliminar producto\n4. Modificar producto\n5. Salir");
}
public static void menucliente() {
	System.out.println("********** MENÚ *******\n1. Ver productos del supermercado\n2. Añadir productos al carrito\n3. Mostrar carrito de la compra ordenado\n4. Consultar producto de carrito\n5. Eliminar producto\n6. Salir");
}
}
