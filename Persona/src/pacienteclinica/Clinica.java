
package pacienteclinica;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


    
public final class Clinica {
	
	static EvaluadorP pacientes = new EvaluadorP();

	public static void main(String[] args) {
		
		pacientes.nuevoPaciente();
		pacientes.mostrarPacientes();
                setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

    private static void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
