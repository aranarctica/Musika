package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utilidades.Conector;


/**
 * 
 * @author Xabi
 *
 */
public class UsuariosModelo extends Conector {

	public ArrayList<Usuarios> selectAll() {

		ArrayList<Usuarios> usuario = new ArrayList<Usuarios>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from usuarios");
			while (rs.next()) {
				Usuarios usuarios = new Usuarios();
				usuarios.setId(rs.getInt("id"));
				usuarios.setNombre(rs.getString("nombre"));
				usuarios.setApellido(rs.getString("apellido"));
				usuarios.setEmail(rs.getString("email"));

				usuario.add(usuarios);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;

	}

	public Usuarios select(int id) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from usuarios where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Usuarios usuario = new Usuarios();
				usuario.setId(rs.getInt("id"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellido(rs.getString("apellido"));
				usuario.setEmail(rs.getString("email"));
				return usuario;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public void insert(Usuarios usuarios) {
		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("insert into usuarios (nombre,apellido,email) values(?,?,?");
			pst.setString(1, usuarios.getNombre());
			pst.setString(2, usuarios.getApellido());
			pst.setString(3, usuarios.getEmail());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(Usuarios usuarios) {
		try {
			PreparedStatement pst = super.conexion
					.prepareStatement("update usuarios set nombre = ?, apellido = ?, email = ?");
			pst.setString(1, usuarios.getNombre());
			pst.setString(2, usuarios.getApellido());
			pst.setString(3, usuarios.getEmail());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("delete from usuario where id = ?");
			pst.setInt(1, id);
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
