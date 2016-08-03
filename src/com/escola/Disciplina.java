package com.escola;

public final class Disciplina {
	
	//atributos-----------------------------------------------------------------------
	private int codigo;

	private String nome;

	private int cargaHoraria;
	
	private Matricula[] matricula;

	private Professor professor;
	
	//Construtor----------------------------------------------------------------------
	public Disciplina(int codigo, String nome, int cargaHoraria){
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	
	//Metodos acessores----------------------------------------------------------------
	public int getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	//Metodos Sobrescritos----------------------------------------------------------------
		@Override
		public String toString(){
			return "Codigo: " + this.codigo + " Nome: " + this.nome + 
					" Carga Horaria: " + this.getCargaHoraria();
		}
		
		@Override
		public boolean equals(Object o){
			if( o != null && o instanceof Disciplina){
				Disciplina p = (Disciplina) o;
				return p.codigo == this.codigo && p.nome.equals(this.nome) && 
						p.cargaHoraria == this.cargaHoraria;
			}
			return false;
		}
}
