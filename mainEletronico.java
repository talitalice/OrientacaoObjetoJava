package ClassesPoo;

public class mainEletronico {
	public static void main(String[] args) {

		Eletronico V3 = new Eletronico();
		V3.ligar();
		V3.cor = "dourado";
		V3.geracao = 3;
		V3.modelo = "motorola Razr";
		V3.mp = 13;
		V3.tamanho = 2.2;
		V3.carga = 80;

		System.out.println();

		V3.status();

		


	}



}
