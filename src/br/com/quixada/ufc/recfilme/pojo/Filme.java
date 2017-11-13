package br.com.quixada.ufc.recfilme.pojo;

public class Filme {
	private Integer idfilme;
	private String nomefilme;
	private String tipo;
	private String principal;
	private String coadjuvante;
	private String duracao;
	private String diretor;
	private String lancamento;
	
	public Filme(Integer idfilme, String nomefilme, String tipo, String principal, String coadjuvante, String duracao,
			String diretor, String lancamento) {
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
	
	public Filme(String nomefilme, String tipo, String principal, String coadjuvante, String duracao, String diretor,
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getCoadjuvante() {
		return coadjuvante;
	}
	public void setCoadjuvante(String coadjuvante) {
		this.coadjuvante = coadjuvante;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getLancamento() {
		return lancamento;
	}
	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}
	
	
}
