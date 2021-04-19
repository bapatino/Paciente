package pacienteclinica;

import javax.swing.JOptionPane;

public final class Paciente {
	
	private String nombre;
	private String apellidos;
	private int edad, codigo;
	private String sexo;
	
	public Paciente(String nombre, String apellidos, int edad, String sexo, int codigo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
                this.codigo = codigo;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
        

	public void mostrar() {
		String mensaje = "\nNombre: " + nombre
				+ "\nApellidos: " + apellidos + "\nEdad: " + edad
				+ "\nCodigo: " + codigo+ "\nSexo: " + sexo;
		JOptionPane.showMessageDialog(null, mensaje, "Paciente", JOptionPane.INFORMATION_MESSAGE);
	}

}