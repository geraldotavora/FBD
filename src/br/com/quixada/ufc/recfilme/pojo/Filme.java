package br.com.quixada.ufc.recfilme.pojo;

public class Filme {
	private Integer idfilme;
	private String nomefilme;
	private Tipo_Filme tipo;
	private Ator principal;
	private Ator coadjuvante;
	private String duracao;
	private Diretor diretor;
	private String lancamento;
	
	public Filme(Integer idfilme, String nomefilme, Tipo_Filme tipo, Ator principal, Ator coadjuvante, String duracao,
			Diretor diretor, String lancamento) {
		super();
		this.idfilme = idfilme;
		this.nomefilme = nomefilme;
		this.tipo = tipo;
		this.principal = principal;
		this.coadjuvante = coadjuvante;
		this.duracao = duracao;
		this.diretor = diretor;
		this.lancamento = lancamento;
	}
	
	public Filme(String nomefilme, Tipo_Filme tipo, Ator principal, Ator coadjuvante, String duracao, Diretor diretor,
			String lancamento) {
		super();
		this.nomefilme = nomefilme;
		this.tipo = tipo;
		this.principal = principal;
		this.coadjuvante = coadjuvante;
		this.duracao = duracao;
		this.diretor = diretor;
		this.lancamento = lancamento;
	}
	public Integer getIdfilme() {
		return idfilme;
	}
	public void setIdfilme(Integer idfilme) {
		this.idfilme = idfilme;
	}
	public String getNomefilme() {
		return nomefilme;
	}
	public void setNomefilme(String nomefilme) {
		this.nomefilme = nomefilme;
	}
	public Tipo_Filme getTipo() {
		return tipo;
	}
	public void setTipo(Tipo_Filme tipo) {
		this.tipo = tipo;
	}
	public Ator getPrincipal() {
		return principal;
	}
	public void setPrincipal(Ator principal) {
		this.principal = principal;
	}
	public Ator getCoadjuvante() {
		return coadjuvante;
	}
	public void setCoadjuvante(Ator coadjuvante) {
		this.coadjuvante = coadjuvante;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public String getLancamento() {
		return lancamento;
	}
	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}
	
	
}
