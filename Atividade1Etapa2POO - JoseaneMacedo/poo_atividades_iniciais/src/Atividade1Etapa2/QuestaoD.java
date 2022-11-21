package Atividade1Etapa2;

import java.util.Scanner;

public class QuestaoD {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		String modeloCarro,categoria;
		int anoCarro;
		float valor;
		float quilometragem;
	
		System.out.print("Digite o modelo do carro: ");
		modeloCarro = entrada.nextLine();
		System.out.print("Agora, a categoria: ");
		categoria = entrada.nextLine();
		System.out.print("O Ano de fabricação: ");
		anoCarro = entrada.nextInt();
		System.out.print("O valor pago pelo carro: ");
		valor = entrada1.nextFloat();
		System.out.print("Por fim, insira a quilometragem: ");
		quilometragem = entrada1.nextFloat();
		
		CarroUber carro = new CarroUber();
		
		
		carro.setModelo(modeloCarro);
		carro.setCategoria(categoria);
		carro.setAno(anoCarro);
		carro.setPreco(valor);
		carro.setQuilometragem(quilometragem);
		
			
		System.out.printf("%n-O carro do modelo %s", carro.getModelo());
		System.out.printf("%n-Categoria %s", carro.getCategoria());
		System.out.printf("%n-Ano de fabricação %s %n-%s",carro.getAno(), carro.fabricacao());
		System.out.printf("%n-Tempo de fabricação: %s", carro.tempoFabricacao());
		System.out.printf("%n-O valor do carro: %.2f", carro.getPreco());
		System.out.printf("%n-%s.%n-%s", carro.valorCarro(), carro.revisaoSUV());
		
		
					
		entrada.close();
		entrada1.close();	

	}

}
