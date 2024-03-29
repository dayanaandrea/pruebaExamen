package ordenadoresElorrieta.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ordenadoresElorrieta.utils.DBUtils;

public class AnadirAlumno {
	
	public boolean guardarAlumnoEnBaseDeDatos(int id , String nombre, String apellido, int edad) {

		boolean insercionExitosa = false;
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			// El Driver que vamos a usar
			Class.forName(DBUtils.DRIVER);
			// Abrimos la conexion con BBDD
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Crear la consulta SQL
			String sql = "INSERT INTO t_alumno ( id ,  nombre,  apellido,  edad) VALUES (?, ?, ?, ?)";
			stm = connection.prepareStatement(sql);
			stm.setInt(1, id);
			stm.setString(2, nombre);
			stm.setString(3, apellido);
			stm.setInt(4, edad);

			// Ejecutar la consulta SQL
			int filasAfectadas = stm.executeUpdate();

			// Verificar si ha insertado
			if (filasAfectadas > 0) {
				insercionExitosa = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (stm != null)
					stm.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}

		return insercionExitosa;
	}
}