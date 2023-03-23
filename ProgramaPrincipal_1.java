package aula01;

public class ProgramaPrincipal_1 {

	//Criando a referencia do objeto
	public static void main(String[] args) {
	
		//Inserindo informações dentro do objeto
		Carro novoCarro = new Carro();
		novoCarro.marca = "VW";
		novoCarro.modelo = "Fox";
		novoCarro.cor = "Azul";
		novoCarro.km = 87900;
		
		//Pegando as informações do objeto e mostrando no console(saida)
		System.out.println("Marca: " + novoCarro.marca);
		System.out.println("Modelo: " + novoCarro.modelo);
		System.out.println("Cor: " + novoCarro.cor);
		System.out.println("Km: " + novoCarro.km);
	}

}