package com.escola;

public final class Mestre extends Professor {
	
	//atributos-----------------------------------------------------------------------
	private String tituloDissertacao;
	
	//Construtor----------------------------------------------------------------------
	public Mestre(Long cpf, String nome, double salario, String titulo, Disciplina disc){
		super(cpf, nome, salario, disc);
		this.tituloDissertacao = titulo;
	}
	
	//Metodos acessores----------------------------------------------------------------
	public String getTituloDissertacao() {
		return tituloDissertacao;
	}

	public void setTituloDissertacao() {

	}
	
	//Metodos Sobrescritos----------------------------------------------------------------
	@Override
	public String toString(){
		return super.toString() +" Titulo de Dissertacao: " + this.tituloDissertacao;
	}
	
	@Override
	public boolean equals(Object o){
		if( o != null && o instanceof Mestre){
			Mestre p = (Mestre) o;
			return super.equals(p) && this.tituloDissertacao.equals(p.tituloDissertacao) ;
		}
		return false;
	}

}