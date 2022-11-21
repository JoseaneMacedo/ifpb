package Atividade2Etapa2;

public class Paciente {
	private String nome;
	private String cpf;
	private String endereco;
	private String rg;
	private String sintomas;
	

	public Paciente() {

	}
	public Paciente (String novoNome, String novoCpf, String novoRg) {
		this.setNome(novoNome);
		this.setCpf(novoCpf);
		this.setEndereco(" "); 
		this.setRg(novoRg);
		this.setSintomas("");

		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String toString() {
		String retorno = "\nNome: " + getNome() + "\nCPF: " + getCpf();
		if (!getRg().equals(""))
			retorno += "\nRG: " + getRg();
		if (!getSintomas().equals(""))
			retorno += "\nSintomas: " + getSintomas();
		return retorno;
	}

	public boolean equals(Paciente p) {
		if (getCpf().equals(p.getCpf()) && getRg().equals(p.getRg()))
			return true;
		else
			return false;
	}
}
