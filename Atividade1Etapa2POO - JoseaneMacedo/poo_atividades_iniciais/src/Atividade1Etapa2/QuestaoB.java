package Atividade1Etapa2;

import java.util.Scanner;

public class QuestaoB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		String nome;
		int idade;
		double peso, altura;
	
		System.out.print("Digite o seu nome completo: ");
		nome = entrada.nextLine() ;
		
		System.out.print("Qual sua idade: ");
		idade = entrada1.nextInt() ;
		System.out.print("Insira seu peso em Kg (ex. 67.8): ");
		peso = entrada1.nextDouble() ;
		System.out.print("Insira sua altura em m (ex. 1.8): ");
		altura = entrada1.nextDouble() ;
		
		AlunoAcademia a = new AlunoAcademia();
		
		a.setNome(nome);
		a.setIdade(idade);
		a.setPeso(peso);
		a.setAltura(altura);
				
		double calculoImc = a.calcularIMC();
		
		System.out.println("========================================\n\n"
				+ "Academia Corpo & Vida\n\n"
				+ "========================================"
				+ "\n-DADOS DO ALUNO(A)\n");
		System.out.println("Aluno(a):"+ a.getNome());
		System.out.printf("Idade:%s %nPeso: %.1f %nAltura: %.2f %n",a.getIdade(),a.getPeso(),a.getAltura());
		System.out.printf("IMC é: %.1f%n", calculoImc );
		System.out.println(a.resultadoMaioridade());
		
		entrada.close();
		entrada1.close();
	
	}

	}
