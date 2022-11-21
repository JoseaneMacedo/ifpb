package Atividade3Etapa2;

import java.util.Scanner;

public class Questao3Ingresso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Ingresso normal = new Ingresso();
		normal.setValor(50.00);
		
		IngressoVIP vip = new IngressoVIP();
		vip.setValorAdicional(35.00);
		
		System.out.println(" 'Vendas on-line de ingressos para o Show do Reveillon 2023\n\n");
		System.out.println("\n-Qual das opções abaixo voçe deseja?\nPara PISTA, digite a Opção 1;\n"
				+ "Para ESPAÇO VIP, gigite 2:\nOPÇÂO:");
		int tipo = entrada.nextInt();
		
		if(tipo == 1) {
			System.out.println(normal.toString());
			
		}else {
			System.out.println(vip.toStringIngressoVip());
		}
		
		
		
		
		
		
		
		entrada.close();

	}

}
