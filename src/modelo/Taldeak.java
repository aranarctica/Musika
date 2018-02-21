package modelo;

import java.util.ArrayList;
/**
 * 
 * @author Xabi
 *
 */
public class Taldeak {
	private int id;
	private String nombre;
	private String componentes;
	private String estilo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComponentes() {
		return componentes;
	}

	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public ArrayList<Contratan> getContrata() {
		return contrata;
	}

	public void setContrata(ArrayList<Contratan> contrata) {
		this.contrata = contrata;
	}

	private ArrayList<Contratan> contrata;
}
