package br.com.caelum.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

@WebService
@Stateless
public class LivrariaWS {
	
	@Inject
	LivroDao dao;
	
	@WebResult(name="livros")
	public List<Livro> getLivrosPorTitulo(@WebParam(name="titulo") String titulo){
		System.out.println("[LivrariaWS] Procurando pelo titulo " + titulo);
		List<Livro> livros = dao.livrosPeloTitulo(titulo);
		return livros;
	}
}
