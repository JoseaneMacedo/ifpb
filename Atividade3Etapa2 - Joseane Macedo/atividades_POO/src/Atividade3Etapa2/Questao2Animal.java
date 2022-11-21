package Atividade3Etapa2;

import java.util.Scanner;

public class Questao2Animal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String b = "-Animal-";
		
		Animal a = new Animal();
		
		a.setFamilia("Ave");
		a.setNome("Papagaio");
		a.setPeso("3.5 kg");
		a.setAltura("0.25 m");
		
		Ave beijaFlor = new Ave();
		
		beijaFlor.setFamilia("Ave");
		beijaFlor.setNome("beija-flor");
		beijaFlor.setPeso("25 g");
		beijaFlor.setAltura("10 cm");
		beijaFlor.setTempoVoo("20 h");
		
		Inseto formiga = new Inseto();
			
		formiga.setFamilia("Formicidae");
		formiga.setNome("Formiga carpinteira");
		formiga.setPeso("3 mg");
		formiga.setAltura("6 a 20 ml");
		formiga.setNumAntenas("2");
		formiga.setNumPatas("6");
		
		
		System.out.println("\n"+b +a.toStringAnimal());
		System.out.println("\n"+b+ beijaFlor.toStringAnimal()+ beijaFlor.toStringAve());
		System.out.println("\n"+b+ formiga.toStringAnimal()+formiga.toStringInseto());
		
			
		entrada.close();
		
		
		
		

	}

}
