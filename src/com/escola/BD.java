package com.escola;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class BD {
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Disciplina> listaDisciplina;
	private ArrayList<Professor> listaProfessores;
	private ArrayList<Matricula> listaMatriculas;
	
	public BD(){
		listaAlunos = new ArrayList<Aluno>();
		listaDisciplina = new ArrayList<Disciplina>();
		listaProfessores = new ArrayList<Professor>();
		listaMatriculas = new ArrayList<Matricula>();
	}
	
	public void addAluno(Aluno novoAluno){
		this.listaAlunos.add(novoAluno);
	}
	
	public void addDisciplina(Disciplina novaDisciplina){
		this.listaDisciplina.add(novaDisciplina);
	}
	
	public void addProfessor(Professor novoProfessor){
		this.listaProfessores.add(novoProfessor);
	}
	
	public void addMatricula(Matricula novaMatricula){
		this.listaMatriculas.add(novaMatricula);
	}
	
	public StringBuilder gerarBackup(){
		
		StringBuilder strBuffer = new StringBuilder("Backup realizado em ");	//iniciando StringBuilder
		Date data = new Date();			
		strBuffer.append(data.getDay() + " de " + data.getMonth() + " de " +  data.getYear());
		strBuffer.append(" às " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() + "\n\n");
		
		strBuffer.append("Alunos\n");
		
		for(Aluno aluno: listaAlunos){
			strBuffer.append(aluno.toString() + "\n");
		}

		return strBuffer;
	}
	
}
