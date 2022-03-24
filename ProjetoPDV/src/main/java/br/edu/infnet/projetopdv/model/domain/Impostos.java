package br.edu.infnet.projetopdv.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Impostos {
	
	private String Codigo_Prod;
	private String Descrição;
	private String Tipo_Imposto;
	private LocalDateTime Data;
	private boolean Base_Legal;

	
	private List<Produto> Produto; 
	private List<Localidade> LOCALIDADE;
	
	public Impostos() {
		Codigo_Prod = "Produto Revenda";
		Descrição = "Revenda";
		Data = LocalDateTime.now();
		Tipo_Imposto = "Calculo Online"; 
		Base_Legal = true;
	}

	@Override
	public String toString() {
			
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm" );
		
		
		return String.format("%s;%s;%s,%s,%s", 
				Codigo_Prod,
				Descrição,
				Tipo_Imposto,
				Data.format (formato),
				Base_Legal ? "Online" : "Offline"  );
	}
	
	public String getCodigo_Prod() {
		return Codigo_Prod;
	}

	public void setCodigo_Prod(String codigo_Prod) {
		Codigo_Prod = codigo_Prod;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	public String getTipo_Imposto() {
		return Tipo_Imposto;
	}

	public void setTipo_Imposto(String tipo_Imposto) {
		Tipo_Imposto = tipo_Imposto;
	}

	public boolean isBase_Legal() {
		return Base_Legal;
	}

	public void setBase_Legal(boolean base_Legal) {
		Base_Legal = base_Legal;
	}

	public List<Produto> getProduto() {
		return Produto;
	}

	public void setProdutos(List<Produto> produto) {
		Produto = produto;
	}

	public List<Localidade> getLOCALIDADE() {
		return LOCALIDADE;
	}

	public void setLOCALIDADE(List<Localidade> LOCALIDADE) {
		LOCALIDADE = LOCALIDADE;
	}

	public void setData(LocalDateTime data) {
		Data = data;
	}
    
	
}
