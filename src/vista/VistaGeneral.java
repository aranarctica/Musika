package vista;

import java.util.Scanner;

/**
 * 
 * @author Xabi
 *
 */
public class VistaGeneral {
	static final int GESTIONAR_GRUPOS = 1;
	static final int GESTIONAR_USUARIOS = 2;
	static final int GESTIONAR_CONTRATACIONES = 3;
	static final int SALIR = 0;
	
	public void menuGeneral(){
		TaldeakVista taldeakVista = new TaldeakVista();
		UsuariosVista usuariosVista = new UsuariosVista();
		ContratanVista contratanVista = new ContratanVista();
		
		int opcion;
		Scanner scan = new Scanner (System.in);
		do{
			System.out.println(GESTIONAR_GRUPOS +" gestor de grupos");
			System.out.println(GESTIONAR_USUARIOS +" gestor de usuarios");
			System.out.println(GESTIONAR_CONTRATACIONES+ " gestor de contrataciones");
			
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion){
			case GESTIONAR_GRUPOS:
				break;
			case GESTIONAR_USUARIOS:
				break;
			case GESTIONAR_CONTRATACIONES:
				break;
			default:
				break;
			}
		}while(opcion != SALIR);
	}
}
