package com.escola;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Aplicacao {
	
	public static Scanner ler;
	
	public  static Aluno incluirAluno(){
		int matricula;
		String nome;
		Date data;
		System.out.println("Adicionando um novo aluno...");
		System.out.println("Entre com os dados: ");
		System.out.println("Matricula: ");
		matricula = Integer.parseInt(ler.nextLine());
		System.out.println("Nome: ");
		nome = new String(ler.nextLine());
		System.out.println("Data de nascimento: ");
		
		data = new Date(ler.nextLine());
		SimpleDateFormat sdt = new SimpleDateFormat("MM/dd/yy");
		
		Aluno novoAluno = new Aluno(matricula,nome,data);

		return novoAluno;
	}
	
	
	public static void main(String [] args){
		BD bd = new BD();
		ler = new Scanner(System.in);
		int menu = -1;
		while(menu != 0){
			System.out.println("Menu");
			System.out.println("1 - Incluir aluno");
			System.out.println("2 - Gerar Backup");
			System.out.println("0 - Sair");
			
			menu = Integer.parseInt(ler.nextLine());
			
			switch(menu){
				case 1 : 
					bd.addAluno(incluirAluno());
					break;
				case 2 :
					System.out.println(bd.gerarBackup());
					break;
			}
			
		}
		ler.close();
	}
	
}
