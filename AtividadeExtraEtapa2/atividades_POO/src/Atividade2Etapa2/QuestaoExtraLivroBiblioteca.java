package Atividade2Etapa2;

public class QuestaoExtraLivroBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setNome("BIBLIOTECA MACHADO DE ASSIS");
		biblioteca.setCNPJ("12.134.654/0001-76");
		biblioteca.setEndereço("Rua: José Venâncio, 88");
		
		
		
		Livros a1 = new Livros();
		a1.setNome("O Pequeno Príncipe");
		a1.setAutor("Antoine de Saint-Exupéry");
		a1.setISBN("9788522031443");
		a1.setEdicao("49ª");;
		biblioteca.Adicionar(a1);
		
		Livros a2 = new Livros();
		a2.setNome("O Encontro Marcado");
		a2.setAutor("Fernando Sabino");
		a2.setISBN("9788501052155");
		a2.setEdicao("99ª");
		biblioteca.Adicionar(a2);
		
		Livros a3 = new Livros();
		a3.setNome("Quando fui outro");
		a3.setAutor("Fernando Pessoa");
		a3.setISBN("9788573028041");
		a3.setEdicao("1ª");
		biblioteca.Adicionar(a3);
		
		
		
		Livros a4 = new Livros();
		a4.setNome("Auto da compadecida");
		a4.setAutor("Ariano Suassuna");
		a4.setISBN("9788520938393");
		a4.setEdicao("39ª");
		biblioteca.Adicionar(a4);
		
		Livros a5 = new Livros();
		a5.setNome("A Menina Que Roubava Livros");
		a5.setAutor("Markus Zusak");
		a5.setISBN("9788580574517");
		a5.setEdicao("3ª");
		biblioteca.Adicionar(a5);
		
		biblioteca.ExibirBibioteca();
		biblioteca.Exibir();
		
	}

}
