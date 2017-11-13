package br.com.quixada.ufc.recfilme.pojo;

public class Usuario {
	private Integer codigo;
	private String nome;
	private String email;
	private String endereco;
	private String genero;
	private String ator_pref;	
	
	
	public Usuario(String nome, String email, String endereco, String genero, String ator_pref) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.genero = genero;
		this.ator_pref = ator_pref;
	}
	
	
	public Usuario(Integer codigo, String nome, String email, String endereco, String genero, String ator_pref) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.genero = genero;
		this.ator_pref = ator_pref;
	}



	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAtor_pref() {
		return ator_pref;
	}
	public void setAtor_pref(String ator_pref) {
		this.ator_pref = ator_pref;
	}


	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", genero=" + genero + ", ator_pref=" + ator_pref + "]";
	}
	
	
	
}
