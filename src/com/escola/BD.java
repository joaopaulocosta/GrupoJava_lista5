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
	
	//metodo para retornar o mes em português
	private  String mes(int mes){
		String res = "";
		switch(mes){
			case 1:
				res =  "janeiro";
				break;
			case 2:
				res =  "fevereiro";
				break;
			case 3:
				res =  "março";
				break;
			case 4:
				res =  "abril";
				break;
			case 5:
				res =  "maio";
				break;
			case 6:
				res =  "junho";
				break;
			case 7:
				res =  "julho";
				break;
			case 8:
				res =  "agosto";
				break;
			case 9:
				res =  "setembro";
				break;
			case 10:
				res =  "outubro";
				break;
			case 11:
				res =  "novembro";
				break;
			case 12:
				res =  "dezembro";
				break;
				
		}
		
		return res;
	}
	
	public StringBuilder gerarBackup(){
		
		//iniciando StringBuilder
		StringBuilder strBuffer = new StringBuilder("------------------------------------------------------------\n");	
		strBuffer.append("Backup realizado em ");
		Date data = new Date();			
		strBuffer.append(data.getDay() + " de " + this.mes(data.getMonth()) + " de " +  (1900 + data.getYear()));
		strBuffer.append(" às " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() + "\n\n");
		
		strBuffer.append("Alunos\n");
		
		for(Aluno aluno: listaAlunos){
			strBuffer.append(aluno.toString() + "\n");
		}
		
		strBuffer.append("------------------------------------------------------------\n");
		
		return strBuffer;
	}
	
}
