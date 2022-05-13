package ClassesPoo;

public class moldPaciente {
	public static void main(String[] args) {

		PacienteP paciente = new PacienteP();
		paciente.falar();
		paciente.nome = "Diogo";
		paciente.idade = 33 ;
		paciente.sexo = "Masculino";
		paciente.stdCivil = "Solteiro";
		paciente.sintomas = "Dor de cabeça, Vomito, tontura";

		System.out.println();

		paciente.status();



	}

}


