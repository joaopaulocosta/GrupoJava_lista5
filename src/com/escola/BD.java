package com.escola;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class BD {
	private ArrayList<Aluno> listaAlunos;
	private ArrayList<Disciplina> listaDisciplinas;
	private ArrayList<Professor> listaProfessores;
	private ArrayList<Matricula> listaMatriculas;
	
	public BD(){
		listaAlunos = new ArrayList<Aluno>();
		listaDisciplinas = new ArrayList<Disciplina>();
		listaProfessores = new ArrayList<Professor>();
		listaMatriculas = new ArrayList<Matricula>();
	}

//Metodos de inclusao---------------------------------------------------------------------------------------------------
	
	public void addDisciplina(Disciplina novaDisciplina){
		this.listaDisciplinas.add(novaDisciplina);
	}
	
	public void addProfessor(Professor novoProfessor){
		this.listaProfessores.add(novoProfessor);
	}
	
	public void addMatricula(Matricula novaMatricula){
		this.listaMatriculas.add(novaMatricula);
	}
	
	public void addAluno(Aluno novoAluno){
		this.listaAlunos.add(novoAluno);
	}
	

//Metodos de exclusao---------------------------------------------------------------------------------------------------
	
	//metodo que ira excluir um aluno a partir do numero de sua matricula
	public void excluirAluno(int matricula){
		for(Aluno aluno : listaAlunos){
			if(aluno.getMatricula() == matricula){
				listaAlunos.remove(aluno);
				return;
			}
		}
	}
	
	//metodo que ira excluir um professor a partir do numero de cpf
	public void excluirProfessor(long cpf){
		for(Professor professor : this.listaProfessores){
			if(professor.getCpf() == cpf){
				listaProfessores.remove(professor);
				return;
			}
		}
	}
	
	//metodo que ira excluir uma disciplina a partir de seu codigo
	public void excluirDisciplina(int codigo){
		for(Disciplina disciplina : this.listaDisciplinas){
			if(disciplina.getCodigo() == codigo){
				listaDisciplinas.remove(disciplina);
				return;
			}
		}
	}

//Metodos de listagem---------------------------------------------------------------------------------------------------	

	//metodo que lista aluno a partir do numero de sua matricula
	public void listarAluno(int matricula){
		for(Aluno aluno : this.listaAlunos){
			if(aluno.getMatricula() == matricula){
				System.out.println(aluno.toString());
				return;
			}
		}
	}
	
	//metodo que lista professor a partir do numero de cpf
	public void listarProfessor(long cpf){
		for(Professor professor : this.listaProfessores){
			if(professor.getCpf() == cpf){
				System.out.println(professor.toString());
				return;
			}
		}
	}
	
	//metodo que lista disciplina a partir do seu codigo
	public void listarDisciplina(int codigo){
		for(Disciplina disciplina : this.listaDisciplinas){
			if(disciplina.getCodigo() == codigo){
				System.out.println(disciplina.toString());
				return;
			}
		}
	}
	
//----------------------------------------------------------------------------------------------------------------------

	//metodo que retorna um professor a partir do numero de cpf
	public Professor getProfessor(long cpf){
		for(Professor professor : this.listaProfessores){
			if(professor.getCpf() == cpf){
				return professor;
			}
		}
		return null;
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
		
		for(Aluno aluno: this.listaAlunos){
			strBuffer.append(aluno.toString() + "\n");
		}
		
		strBuffer.append("\n");
		
		strBuffer.append("Professores\n");
		
		for(Professor professor: this.listaProfessores){
			strBuffer.append(professor.toString() + "\n");
		}
		
		strBuffer.append("\n");
		
		strBuffer.append("Disciplinas\n");
		
		for(Disciplina disciplina: this.listaDisciplinas){
			strBuffer.append(disciplina.toString() + "\n");
		}
		
		strBuffer.append("------------------------------------------------------------\n");
		
		return strBuffer;
	}
	
}
