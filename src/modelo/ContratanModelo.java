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

public class ContratanModelo extends Conector {

	public ArrayList<Contratan> SelectAll() {

		Contratan contratan;
		ArrayList<Contratan> contrata = new ArrayList<Contratan>();
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("seelect * from contratan");
			while (rs.next()) {
				contratan = new Contratan();
				contratan.setId(rs.getInt("id"));
				contrata.addAll(contrata);
			}
			return contrata;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contrata;

	}

	public void insertar(Contratan contratan) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("insert into contratan(idUsuarios, idTaldeak)");
			
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(Contratan contratan) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("update contratan set idUsuarios, idTaldeak");
			
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
