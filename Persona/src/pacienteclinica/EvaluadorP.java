package pacienteclinica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public final class EvaluadorP {
	
	private ArrayList<Paciente> pacientes;
	
	public EvaluadorP() {
		pacientes = new ArrayList<Paciente>();
	}
	public boolean nuevoPaciente() {
		String nombre = JOptionPane.showInputDialog(null, "Nombre:",JOptionPane.QUESTION_MESSAGE);
		String apellidos = JOptionPane.showInputDialog(null, "Apellidos:",JOptionPane.QUESTION_MESSAGE);
		String sexo = JOptionPane.showInputDialog(null, "Sexo:", JOptionPane.QUESTION_MESSAGE);
		int edad = 0;
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad:", JOptionPane.QUESTION_MESSAGE));
                int codigo = 0;
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo:", JOptionPane.QUESTION_MESSAGE));
		Paciente nuevoPaciente = new Paciente(nombre, apellidos, edad, sexo, codigo);
		return pacientes.add(nuevoPaciente);
	}
	public void mostrarPacientes() {
		for (Paciente p: pacientes)
			p.mostrar();
	}
}