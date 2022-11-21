package Atividade1Etapa2;

import java.util.Scanner;

public class QuestaoA {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
		   
	    String n,resultadoFinal;
	    float notaT1,notaT2,notaP1,notaP2;
	       
	    System.out.print("Digite o nome do(a) aluno(a): ");
	    n= entrada.nextLine();
	    System.out.print("Digite a nota da 1º trabalho: ");
	    notaT1 = entrada.nextFloat();
	    System.out.print("Digite a nota da 2º trabalho: ");
	    notaT2 = entrada.nextFloat();
	    System.out.print("Digite a nota da 1ª prova: ");
	    notaP1 = entrada.nextFloat();
	    System.out.print("Digite a nota da 2ª prova: ");
	    notaP2 = entrada.nextFloat();
	    
	    Aluno a = new Aluno(n);
	   
	    a.setTrabalho1(notaT1);
	    a.setTrabaho2(notaT2);
	    a.setProva1(notaP1);
	    a.setProva2(notaP2);
	    
	    resultadoFinal = a.exibirResultado();
	    

	    System.out.println("Nome: "+ a.getNome());
	    System.out.println("1ª nota: "+ a.getTrabalho1());
	    System.out.println("2ª nota: "+ a.getTrabaho2());
	    System.out.println("3ª nota: "+ a.getProva1());
	    System.out.println("4ª nota: "+ a.getProva2() );
	    System.out.println("Média: "+ a.calcularMedia());
	    System.out.println(resultadoFinal);
	    
	    entrada.close();

	}

}
