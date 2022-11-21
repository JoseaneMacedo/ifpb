package Atividade1Etapa2;

public class AlunoAcademia {

	private String nome;
	private int idade;
	private double peso, altura;
	
	public AlunoAcademia() {
	
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		nome = n;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int v_idade) {
		idade = v_idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double v_peso) {
		peso = v_peso;
	}
	public double getAltura() {
		return altura;
	}

	public void setAltura(double v_altura) {
		altura = v_altura;
	}
	public double calcularIMC (){
		double imc = peso /(Math.pow(altura,2));
		return imc;
	}
	public String resultadoMaioridade() {
		if (idade > 18) 
			return "Aluno(a) MAIOR DE IDADE";
		else 
			return "Aluno(a) MENOR MENOR DE IDADE - Desconto especial";
	}

}

