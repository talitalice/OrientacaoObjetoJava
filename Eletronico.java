package ClassesPoo;

public class Eletronico {
	String modelo;
	String cor;
	int geracao;
	double tamanho;
	int mp; 
	int carga;

	public void ligar()
	{
		System.out.println("\nHeloo Moto");
		
	}


	public void status()
	{
		System.out.println("Modelo: " + this.modelo + "\nCor: " + this.cor + "\nGeração: " + this.geracao + "\nPolegadas: " + this.tamanho + "\nMegapixels: " + this.mp + "\ncarga: " + this.carga );

	}
}


