package Atividade2Etapa2;
import java.util.Scanner;

public class Questao1Paciente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

	    Paciente p1 = new Paciente();
	    Paciente p2 = new Paciente();
	    Paciente p3 = new Paciente();
	    Paciente p4 = new Paciente("Ana Maria", "057.234.654-12", "1234560");
	    p4.setEndereco("Rua: Mara Cavalcante, 77");
	    p4.setSintomas("Dor de cabeça");
	  
	    
	    System.out.print("Digite o nome: ");
	    p1.setNome(entrada.nextLine());
	    System.out.print("Digite o CPF: ");
	    p1.setCpf(entrada.nextLine());
	    System.out.print("Digite o endereço: ");
	    p1.setEndereco(entrada.nextLine());
	    System.out.print("Digite o RG: ");
	    p1.setRg(entrada.nextLine());
	    System.out.print("Digite o(s) sintomas: ");
	    p1.setSintomas(entrada.nextLine());
	    
	    System.out.print("\nDigite o nome: ");
	    p2.setNome(entrada.nextLine());
	    System.out.print("Digite o CPF: ");
	    p2.setCpf(entrada.nextLine());
	    System.out.print("Digite o endereço: ");
	    p2.setEndereco(entrada.nextLine());
	    System.out.print("Digite o RG: ");
	    p2.setRg(entrada.nextLine());
	    System.out.print("Digite o(s) sintomas: ");
	    p2.setSintomas(entrada.nextLine());
	    
	    System.out.print("\nDigite o nome: ");
	    p3.setNome(entrada.nextLine());
	    System.out.print("Digite o CPF: ");
	    p3.setCpf(entrada.nextLine());
	    System.out.print("Digite o endereço: ");
	    p3.setEndereco(entrada.nextLine());
	    System.out.print("Digite o RG: ");
	    p3.setRg(entrada.nextLine());
	    System.out.print("Digite o(s) sintomas: ");
	    p3.setSintomas(entrada.nextLine());
	        

	    System.out.println(p1.toString());
	    System.out.println(p1.equals(p2));
	    System.out.println("\n");
	    System.out.println(p2.toString());
	    System.out.println(p2.equals(p3));
	    System.out.println("\n");
	    System.out.println(p3.toString());
	    System.out.println(p3.equals(p1));
	    System.out.println("\n");
	    System.out.println(p4.toString());
	    System.out.println(p4.equals(p1));
	    
	    entrada.close();
	  }

	}

