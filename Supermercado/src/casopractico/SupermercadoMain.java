package casopractico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class SupermercadoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		
		System.out.println("Que quieres hacer?");
		int respuesta = sc.nextInt();
		TreeSet<String> cesta = new TreeSet<>();
		TreeSet<String> productos = new TreeSet<>();
		
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

		
		while(!(respuesta==6)) {
			while(!(respuesta==1) && !(respuesta==2) && !(respuesta==3) && !(respuesta==4) && !(respuesta==5) && !(respuesta==6)) {
				System.out.println("Respuesta no valida");
				respuesta = sc.nextInt();
			}
			switch(respuesta) {
			case 1:
				System.out.println(productos);
				menu();
				System.out.println("Escoga una opcion: ");
				respuesta = sc.nextInt();
				break;
			case 2:
				System.out.println("Escribe los articulos tal cual se muestran en  la lista y escriba 'fin' cuando haya terminado");
				String compra = sc.nextLine();
				while(!compra.contains("fin")) {
					compra = sc.nextLine();
					if(!compra.equals("fin")) {
						if(productos.contains(compra)) {
							if(!cesta.contains(compra)) {
								cesta.add(compra);
							}
							else
								System.out.println("Producto duplicado");
						}
						else
							System.out.println("Ese producto no esta en el supermercado");
					}
					else {
						System.out.println("Productos añadidos");
						menu();
						System.out.println("Escoga una opcion: ");
						respuesta = sc.nextInt();
					}
				}
				break;
			case 3:
				System.out.println(cesta);
				menu();
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
				menu();
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
						if(!cesta.contains(cambio)) {
							cesta.add(cambio);
						}
						else {
							System.out.println("Producto duplicado");
						}
					}
					else
						System.out.println("Ese producto no esta en el supermercado");
				}
				else
					System.out.println("Ese producto no esta en la cesta");
				menu();
				System.out.println("Escoga una opcion: ");
				respuesta = sc.nextInt();
				break;
			}
		}
		
		
	
	}
public static void menu () {
	System.out.println("********** MENÚ ******* \n1. Mostrar productos del supermercado\n2. Añadir productos al carrito\n3. Mostrar carrito de la compra ordenado"
			+ "\n4. Consultar producto del carrito\n5. Cambiar un producto por otro\n6. Salir");
}
		
}
