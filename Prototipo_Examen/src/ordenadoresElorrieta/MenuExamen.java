package ordenadoresElorrieta;

import java.util.Scanner;

public class MenuExamen {


		private Scanner teclado = null;
	   // private GestorDeFicheros gestorDeFicheros = null;

	    public MenuExamen() {
	        teclado = new Scanner(System.in);
	        //gestorDeFicheros = new GestorDeFicheros();
	    }

	    private int escribirMenu() {
	        int ret = 0;
	        do {
	            try {
	                pintarMenu();
	                System.out.print("Escoge una opcion: ");
	                ret = teclado.nextInt();
	                teclado.nextLine();
	            } catch (Exception e) {
	                System.out.println("Error!!! Opcion incorrecta");
	                teclado.nextLine();
	                ret = -1;
	            }
	        } while ((ret < 0) || (ret > 3));
	        return ret;
	    }

	    private void pintarMenu() {
	        System.out.println(" ");
	        System.out.println("- Menu Inicial -");
	        System.out.println("----------------");
	        System.out.println("1. Escribir fichero");
	        System.out.println("2. Mostrar todo el fichero");
	        System.out.println("3. Annadir al final");
	        System.out.println("0. Salir");
	        System.out.println(" ");
	    }

	    public void mostrarMenu() {
	        int opcionMenu = 0;

	        do {
	            opcionMenu = escribirMenu();

	            switch (opcionMenu) {
	            case 0:
	                System.out.println("Adios !!!");
	                break;
	            case 1:
	                //cargarVideojuegosEnFichero();
	                break;
	            case 2:
	                //mostrarVideojuegosDelFichero();
	                break;
	            case 3: 
	                //aniadirVideojuegosEnFichero();
	                break;
	            default:
	                System.out.println("Esta opcion no deberia salir");
	            }

	        } while (opcionMenu != 0);
	        teclado.close();
	    }
		
		
	

}
