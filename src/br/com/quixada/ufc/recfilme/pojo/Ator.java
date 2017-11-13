package br.com.quixada.ufc.recfilme.pojo;

public class Ator {
	private Integer idator;
	private String nome;
	private Integer idade;
	public Ator(Integer idator, String nome, Integer idade) {
		super();
		this.idator = idator;
		this.nome = nome;
		this.idade = idade;
	}
	public Ator(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Integer getIdator() {
		return idator;
	}
	public void setIdator(Integer idator) {
		this.idator = idator;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
