package vista;

import java.util.Scanner;

/**
 * 
 * @author Xabi
 *
 */
public class TaldeakVista {
	static final int LISTAR = 1;
	static final int INSERTAR = 2;
	static final int ACTUALIZAR = 3;
	static final int BORRAR = 4;
	static final int SALIR = 0;
	
	public void menuDeGrupos(){
		Scanner scan = new Scanner(System.in);
		int opcion;
		do{
			System.out.println("------Menu Grupos------");
			System.out.println(LISTAR + " listar");
			System.out.println(INSERTAR + " insertar");
			System.out.println(ACTUALIZAR + " actualizar");
			System.out.println(BORRAR + " borrar");
			System.out.println(SALIR + " salir");
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion){
			case LISTAR:
				break;
			case INSERTAR:
				break;
			case ACTUALIZAR:
				break;
			case BORRAR:
				break;
			default:
				break;
			}
		}while(opcion != SALIR);
	}
}
