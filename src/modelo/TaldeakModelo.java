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

public class TaldeakModelo extends Conector {

	public ArrayList<Taldeak> selectAll() {
		ArrayList<Taldeak> taldea = new ArrayList<Taldeak>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from taldeak");
			while (rs.next()) {
				Taldeak taldeak = new Taldeak();
				taldeak.setId(rs.getInt("id"));
				taldeak.setNombre(rs.getString("nombre"));
				taldeak.setComponentes(rs.getString("componentes"));
				taldeak.setEstilo(rs.getString("estilo"));

				taldea.add(taldeak);
			}
			return taldea;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return taldea;
	}

	public Taldeak select(int id) {

		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from taldeak where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Taldeak taldeak = new Taldeak();
				taldeak.setId(rs.getInt("id"));
				taldeak.setNombre(rs.getString("nombre"));
				taldeak.setComponentes(rs.getString("componentes"));
				taldeak.setEstilo(rs.getString("estilo"));
				return taldeak;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void insert(Taldeak taldeak) {

		try {
			PreparedStatement pst = super.conexion
					.prepareStatement("insert into taldeak (nombre, componentes, estilo) values (?,?,?)");
			pst.setString(1, taldeak.getNombre());
			pst.setString(2, taldeak.getComponentes());
			pst.setString(3, taldeak.getEstilo());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(Taldeak taldeak) {
		try {
			PreparedStatement pst = super.conexion
					.prepareStatement("update taldeak set nombre = ?, componentes = ?, estilo = ?");
			pst.setString(1, taldeak.getNombre());
			pst.setString(2, taldeak.getComponentes());
			pst.setString(3, taldeak.getEstilo());
			pst.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void delete(int id) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("delete from taldeak where id = ?");
			pst.setInt(1, id);

			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}