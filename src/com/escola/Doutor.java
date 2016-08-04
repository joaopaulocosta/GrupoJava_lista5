package com.escola;

public final class Doutor extends Professor {
	
	//atributos-----------------------------------------------------------------------
	public static double bonusSalarial;
	private String tituloTese;
	
	//Construtor----------------------------------------------------------------------
	public Doutor(Long cpf, String nome, double salario, String tituloTese){
		super(cpf, nome, salario);
		this.tituloTese = tituloTese;
	}
	
	//Metodos acessores----------------------------------------------------------------
	public double getBonusSalarial() {
		return bonusSalarial;
	}
	
	public void setBonusSalarial(double novoBonus) {
		bonusSalarial = novoBonus;
	}

	public String getTituloTese() {
		return this.tituloTese;
	}

	public void setTituloTese(String tituloTese) {
			this.tituloTese = tituloTese;
	}
	
	
	
	//Metodos Sobrescritos----------------------------------------------------------------
	@Override
	public String toString(){
		return super.toString() +" Titulo de Tese: " + this.tituloTese;
	}
	
	@Override
	public boolean equals(Object o){
		if( o != null && o instanceof Doutor){
			Doutor p = (Doutor) o;
			return super.equals(p) && this.tituloTese.equals(p.tituloTese) ;
		}
		return false;
	}
	
	// Metodo getSalario sobrescrito para retornar salario mais bonusSalarial
	@Override
		public double getSalario(){
			return super.getSalario() * bonusSalarial;
		}

}
