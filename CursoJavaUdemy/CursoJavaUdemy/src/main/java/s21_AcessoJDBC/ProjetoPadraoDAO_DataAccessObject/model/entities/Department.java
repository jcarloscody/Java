package s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.entities;

import java.io.Serializable;

public class Department implements Serializable {
/*serializable: será para os nossos objetos poderem ser transformados em sequencia de bytes
 * e assim ser eles gravados em arquivos e trafegados em rede 
 */
	private static final long serialVersionUID = 1L;//versao do serializable
	//

	private Integer id; //atributos
	private String name;
	
	public Department() {//construtor vazio - padrao
	}

	public Department(Integer id, String name) { //construtor com args
		this.id = id;
		this.name = name;
	}

	//GETTERS & SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//COMPARACAO PELO CONTEUDO E NAO PELO PONTEIRO
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
