package com.escola;
import java.util.Date;



public final class Aluno {
	
	//atributos-----------------------------------------------------------------------
	private final int matricula;

	private String nome;

	private Date dataNascimento;
	
	private Matricula[] ListaMatriculas;
	
	//Construtor----------------------------------------------------------------------
	public Aluno(int matricula, String nome, Date dataNascimento){
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	//Metodos acessores----------------------------------------------------------------
	public int getMatricula() {
		return this.matricula;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Date data){
		this.dataNascimento = data;
	}
	
	//Metodos Sobrescritos----------------------------------------------------------------
	@Override
	public String toString(){
		return "Matricula: " + this.matricula + " Nome: " + this.nome + 
				" Nascimento: " + this.getDataNascimento();
	}
	
	@Override
	public boolean equals(Object o){
		if( o != null && o instanceof Aluno){
			Aluno p = (Aluno) o;
			return p.matricula == this.matricula && p.nome.equals(this.nome) && 
					p.dataNascimento.equals(this.dataNascimento);
		}
		return false;
	}
}
