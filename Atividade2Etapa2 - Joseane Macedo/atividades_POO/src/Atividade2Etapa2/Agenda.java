package Atividade2Etapa2;

import java.util.ArrayList;
import java.util.List;

class Agenda {
	List<Contato> agenda = new ArrayList<Contato>(10);

	public void Adicionar(Contato c) {
		agenda.add(c);
	}
	public void Retirar(Contato c) {
		agenda.remove(c);
	}
		
	public void Printar() {
		System.out.println("Agenda: "+ agenda.toString());
		
	}
	

}
