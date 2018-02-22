package vista;

import java.util.Scanner;

import modelo.Usuarios;

/**
 * 
 * @author Xabi
 *
 */
public class UsuariosVista {

	static final int LISTAR = 1;
	static final int INSERTAR = 2;
	static final int ACTUALIZAR = 3;
	static final int BORRAR = 4;
	static final int SALIR = 0;
	
	public void menuDeUsuarios(){
		Scanner scan = new Scanner(System.in);
		int opcion;
		do{
			System.out.println("------Menu Usuarios------");
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
	
	private Usuarios insertarUsuarios(Scanner scan){
		Usuarios usuarios = new Usuarios();
		System.out.println("Introduce nombre");
		usuarios.setNombre(scan.nextLine());
		System.out.println("Introduce apellido");
		usuarios.setApellido(scan.nextLine());
		System.out.println("Introduce email");
		usuarios.setEmail(scan.nextLine());
		return usuarios;
		
	}
}
