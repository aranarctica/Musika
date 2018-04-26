package vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Usuarios;
import modelo.UsuariosModelo;

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

	public void menuDeUsuarios() {
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("------Menu Usuarios------");
			System.out.println(LISTAR + " listar");
			System.out.println(INSERTAR + " insertar");
			System.out.println(ACTUALIZAR + " actualizar");
			System.out.println(BORRAR + " borrar");
			System.out.println(SALIR + " salir");
			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case LISTAR:
				UsuariosModelo usuariosModelo = new UsuariosModelo();
				ArrayList<Usuarios> usuario = usuariosModelo.selectAll();
				this.mostrarUsuarios(usuario);
				break;
			case INSERTAR:
				Usuarios usuarios = insertarUsuarios(scan);
				usuariosModelo = new UsuariosModelo();
				usuariosModelo.insert(usuarios);
				break;
			case ACTUALIZAR:
				break;
			case BORRAR:
				break;
			default:
				break;
			}
		} while (opcion != SALIR);
	}

	public void mostrarUsuarios(ArrayList<Usuarios> usuarios){
		Iterator<Usuarios> i = usuarios.iterator();
		while(i.hasNext()){
			Usuarios usuario  = i.next();
			this.mostrarUsuarios(usuarios);
		}
		}
		
	public void mostrarUsuarios(Usuarios usuario){
		System.out.println(usuario.getId()+"\t - "+
						   usuario.getNombre()+ "\t - "+
						   usuario.getApellido()+ "\t- "+
						   usuario.getEmail()+ "\t - ");
	
	}

	private Usuarios insertarUsuarios(Scanner scan) {
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
