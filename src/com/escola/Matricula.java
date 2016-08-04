package com.escola;

public final class Matricula {
	
	//atributos-----------------------------------------------------------------------
	private Integer pontuacao;
	
	private Disciplina disciplina;

	private Aluno aluno;
	
	//Construtor----------------------------------------------------------------------
	public Matricula(Disciplina disciplina, Aluno aluno, Integer pontuacao){
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.pontuacao = pontuacao;
	}
	
	//Metodos acessores----------------------------------------------------------------
	public Integer getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	//Metodos Sobrescritos----------------------------------------------------------------
	@Override
	public String toString(){
		return "Pontuacao: " + this.pontuacao + " Disciplinha: " + this.disciplina.getNome() + " Aluno: " 
				+ this.aluno.getNome();
	}
	
	@Override
	public boolean equals(Object o){
		if( o != null && o instanceof Matricula){
			Matricula p = (Matricula) o;
			return p.pontuacao == this.pontuacao && p.aluno.equals(this.aluno) && 
					p.disciplina.equals(this.disciplina);
		}
		return false;
	}
	
}
