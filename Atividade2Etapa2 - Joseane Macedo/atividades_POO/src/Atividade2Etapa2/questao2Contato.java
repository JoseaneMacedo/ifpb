package Atividade2Etapa2;

import java.util.Scanner;

public class questao2Contato {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Agenda a = new Agenda();
				
		Contato c1 = new Contato();
		Contato c2 = new Contato();
		Contato c3 =  new Contato();
		Contato c4 = new Contato("Ana", "(84)98723-4435");	
		c4.setEndereco("Rua Maiara Gusmão, 45");
		
		Contato c5 = new Contato();	
		Contato c6 = new Contato();
		
		
		
						
		c1.setNome("Joseane Macedo");
		c1.setNumCelular("(83) 98164-5864");
		c1.setEndereco("Rua: Mª Socorro Farias");
		
		
		System.out.print("Insira seu nome: ");
		c2.setNome(entrada.nextLine());
		System.out.print("Digite um número para contato: ");
		c2.setNumCelular(entrada.nextLine());
		System.out.print("Agora, o endereço: ");
		c2.setEndereco(entrada.nextLine());
		
		System.out.print("\nInsira seu nome: ");
		c3.setNome(entrada.nextLine());
		System.out.print("Digite um número para contato: ");
		c3.setNumCelular(entrada.nextLine());
		System.out.print("Agora, o endereço: ");
		c3.setEndereco(entrada.nextLine());
		
		System.out.print("\nInsira seu nome: ");
		c5.setNome(entrada.nextLine());
		System.out.print("Digite um número para contato: ");
		c5.setNumCelular(entrada.nextLine());
		System.out.print("Agora, o endereço: ");
		c5.setEndereco(entrada.nextLine());
		
		System.out.print("\nInsira seu nome: ");
		c6.setNome(entrada.nextLine());
		System.out.print("Digite um número para contato: ");
		c6.setNumCelular(entrada.nextLine());
		System.out.print("Agora, o endereço: ");
		c6.setEndereco(entrada.nextLine());
		
		a.Adicionar(c1);
		a.Adicionar(c2);
		a.Adicionar(c3);
		a.Adicionar(c4);
		a.Adicionar(c5);
		a.Adicionar(c6);
		
		System.out.println("\n"+ c1.toString());
		System.out.println(c1.equals(c2));
		System.out.println("\n"+c2.toString());
		System.out.println(c2.equals(c3));
		System.out.println("\n"+ c3.toString());
		System.out.println(c3.equals(c4));
		System.out.println("\n"+c4.toString());
		System.out.println(c4.equals(c1));
		System.out.println("\n"+c5.toString());
		System.out.println(c5.equals(c6));
		System.out.println("\n"+ c6.toString());
		System.out.println(c6.equals(c1));
		
		a.Printar();
		
		entrada.close();
		
	}

}
