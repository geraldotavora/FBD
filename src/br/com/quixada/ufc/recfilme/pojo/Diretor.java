package br.com.quixada.ufc.recfilme.pojo;

public class Diretor {
	private Integer iddiretor;
	private String nome;
	
	public Diretor(Integer iddiretor, String nome) {
		super();
		this.iddiretor = iddiretor;
		this.nome = nome;
	}

	public Diretor(String nome) {
		super();
		this.nome = nome;
	}

	public Integer getIddiretor() {
		return iddiretor;
	}

	public void setIddiretor(Integer iddiretor) {
		this.iddiretor = iddiretor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
