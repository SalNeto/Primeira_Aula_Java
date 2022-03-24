package br.edu.infnet.projetopdv.model.domain;

public class Localidade {
	
	private String Descricao_UF;
	private String Sigla_UF;
	private String Cod_UF;
	
	public Localidade(String Descricao_UF, String Sigla_UF, String Cod_UF) 
	{
		this.Descricao_UF = Descricao_UF;
		this.Sigla_UF = Sigla_UF;
		this.Cod_UF = Cod_UF;		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder() ;
		
		sb.append(Descricao_UF);
		sb.append(";");
		sb.append(Sigla_UF);
		sb.append(";");
		sb.append(Cod_UF);
		
		return sb.toString();
	}
	
	public String getDescricao_UF() {
		return Descricao_UF;
	}
	public String getSigla_UF() {
		return Sigla_UF;
	}
	public String getCod_UF() {
		return Cod_UF;
	}
	
	
}



