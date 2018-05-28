package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		LivrariaWS livraria = new LivrariaWSProxy();
		Livro[] livros = livraria.getLivrosPorTitulo("Arquitetura");
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
			System.out.println(livro.getAutor().getNome());
		}
	}

}
