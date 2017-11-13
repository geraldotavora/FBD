package br.com.quixada.ufc.recfilme.pojo;

public class Tipo_Filme {
	private Integer idtipofilme;
	private String genero;
	public Tipo_Filme(Integer idtipofilme, String genero) {
		super();
		this.idtipofilme = idtipofilme;
		this.genero = genero;
	}
	public Tipo_Filme(String genero) {
		super();
		this.genero = genero;
	}
	public Integer getIdtipofilme() {
		return idtipofilme;
	}
	public void setIdtipofilme(Integer idtipofilme) {
		this.idtipofilme = idtipofilme;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
