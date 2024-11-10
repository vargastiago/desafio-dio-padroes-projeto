package one.digitalinnovation.gof.dto;

public class ClienteDTO {

	private String nome;
	private String cep;

	public ClienteDTO(String nome, String cep) {
		this.nome = nome;
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
