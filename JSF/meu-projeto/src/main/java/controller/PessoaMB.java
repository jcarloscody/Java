package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Pessoa;

@Named("bean")
@SessionScoped 
public class PessoaMB  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Pessoa pessoa;
	
	private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	
	public String adicionar() {
		listaPessoas.add(pessoa);
		limpar();
		return null;
	}
	
	private void limpar() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(List<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}
	
	
	
}
