package Atividade3Etapa2;

//Crie a classe IMOVEL com os seguintes atributos: codigo, tamanho, valor e
//endereço. Em seguida crie duas subclasses: Apartamento e Casa. Para primeira
//classe você deve adicionar o atributo Andar, enquanto a segunda subclasse
//deverá conter os atributos numGaragens e numPavimentos. No final, crie uma
//classe MAIN para instanciar os objetos das classes criadas.


public class Questao1Imovel {

	public static void main(String[] args) {
		
		Imovel a = new Imovel();
		
		a.setCodigo("100");
	    a.setTamanho("82.000 m²");
	    a.setValor(100.000); 
	    a.setEndereco("Rua do sol");
	    
	    Apartamento a1 = new Apartamento();

	    a1.setAndar("2"); 
	    a1.setCodigo("201");
	    a1.setTamanho("85.000 m²");
	    a1.setValor(100.000); 
	    a1.setEndereco("Rua das Umburanas");

	    Casa x = new Casa();

	   
	    x.setNumGaragens("2");
	    x.setNumPavimentos("3");
	    x.setValor(100.000);
	    x.setCodigo("14");
	    x.setTamanho("150.000 m²");
	    x.setValor(350.000); 
	    x.setEndereco("Rua Rainha da Borborema");
	    

	    System.out.print("-Imovel" + a.toString());
	    System.out.print("\n\n-Apartamento: "+ a1.toString()+"\n"+a1.toStringApartamento());
	    System.out.print("\n\n-Casa:" +x.toString()+"\n" +x.toStringCasa());	    
	    
	  

	}

}
