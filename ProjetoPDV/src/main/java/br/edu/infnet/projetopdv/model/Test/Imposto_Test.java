package br.edu.infnet.projetopdv.model.Test;

import br.edu.infnet.projetopdv.model.domain.Impostos;
import br.edu.infnet.projetopdv.model.domain.Localidade;

public class Imposto_Test {

	public static void main(String[] args) {
		
		Localidade localidade = new Localidade(null, null, null);
		
		Impostos impostos = new Impostos();
		impostos.setDescrição(null);
		impostos.setCodigo_Prod(null);
		impostos.setData(null);
		impostos.setLOCALIDADE(null);
		impostos.setBase_Legal(false);
		System.out.println(impostos);
		

	}

}
