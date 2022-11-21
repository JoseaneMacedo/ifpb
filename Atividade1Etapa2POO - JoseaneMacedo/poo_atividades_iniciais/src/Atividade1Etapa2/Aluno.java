package Atividade1Etapa2;

public class Aluno {
	private String nome;
	private float trabalho1;
	private float trabaho2;
	private float prova1;
	private float prova2;
	private float media;
	private String resultado;

	public Aluno() {
		
	}
	public Aluno(String n) {
		nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		nome = n;
	}

	public float getTrabalho1() {
		return trabalho1;
	}

	public void setTrabalho1(float t1) {
		trabalho1 = t1;
	}

	public float getTrabaho2() {
		return trabaho2;
	}

	public void setTrabaho2(float t2) {
		trabaho2 = t2;
	}

	public float getProva1() {
		return prova1;
	}

	public void setProva1(float p1) {
		prova1 = p1;
	}

	public float getProva2() {
		return prova2;
	}

	public void setProva2(float p2) {
		prova2 = p2;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float med) {
		media = med;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String result) {
		resultado = result;
	}

	public float calcularMedia() {
		return (trabalho1 + trabaho2 + prova1 + prova2) / 4;
	}

	public String exibirResultado() {
		if ((calcularMedia()) > 5) 
			return "Aprovado";
		else 
			return "Reprovado";

	}
}
