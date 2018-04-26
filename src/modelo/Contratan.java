package modelo;

/**
 * 
 * @author Xabi
 *
 */
public class Contratan {

	private int id;
	private Taldeak taldeak;
	private Usuarios usuarios;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Taldeak getTaldeak() {
		return taldeak;
	}
	public void setTaldeak(Taldeak taldeak) {
		this.taldeak = taldeak;
	}
	public Usuarios getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
}
	