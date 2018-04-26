package vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Taldeak;
import modelo.TaldeakModelo;

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
			TaldeakModelo taldeakModelo = new TaldeakModelo();
			switch(opcion){
			case LISTAR:
				taldeakModelo = new TaldeakModelo();
				ArrayList<Taldeak> taldea = taldeakModelo.selectAll();
				this.mostrarTaldeak(taldea);
				break;
			case INSERTAR:
				Taldeak taldeak = insertarTaldeak(scan);
				taldeakModelo = new TaldeakModelo();
				taldeakModelo.insert(taldeak);
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

	private void mostrarTaldeak(ArrayList<Taldeak> taldea) {
		Iterator<Taldeak> i= taldea.iterator();
		while(i.hasNext()){
			Taldeak taldeak = i.next();
			this.mostrarTaldeak(taldea);
		}
	}
	public void mostrarTaldeak(Taldeak taldea){
		System.out.println(taldea.getId()+"\t - "+
							taldea.getNombre()+"\t - "+
							taldea.getComponentes()+"\t - "+
							taldea.getEstilo());
	}
	
	
	private Taldeak insertarTaldeak(Scanner scan) {
		Taldeak taldeak = new Taldeak();
		System.out.println("Introduce nombre del grupo");
		taldeak.setNombre(scan.nextLine());
		System.out.println("Introduce numero de componenetes");
		taldeak.setComponentes(scan.nextLine());
		System.out.println("Introduce estilo del grupo");
		taldeak.setEstilo(scan.nextLine());
		return taldeak;
	}
}
