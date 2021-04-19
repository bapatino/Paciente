package pacienteclinica;

import javax.swing.JOptionPane;

public final class Medico {
	
	private String id;
	private String nombre;
	private String apellidos;
	
	public Medico(String id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Muestra por panel todos los datos del Medico
	 */
	public void mostrar() {
		String mensaje = "Codigo Medico: " + id + "\nNombre: " + nombre
				+ "\nApellidos: " + apellidos ;
		JOptionPane.showMessageDialog(null, mensaje, "Medico", JOptionPane.INFORMATION_MESSAGE);
	}

}