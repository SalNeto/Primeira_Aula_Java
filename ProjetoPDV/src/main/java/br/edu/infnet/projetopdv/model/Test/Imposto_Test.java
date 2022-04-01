package br.edu.infnet.projetopdv.model.Test;

import java.util.List;

import br.edu.infnet.projetopdv.model.domain.Impostos;
import br.edu.infnet.projetopdv.model.domain.Localidade;
import br.edu.infnet.projetopdv.model.domain.Ncm;
import br.edu.infnet.projetopdv.model.domain.Produto;

public class Imposto_Test {

	public static void main(String[] args) {
		
		
		Ncm ncm1 = new ncm ("chop", 10, 987);
		ncm1.setCodigo(0);
		ncm1.setDescricao(null);
		System.out.println(ncm1);
		
		Ncm ncm2 = new ncm ("chop", 10, 987);
		ncm2.setCodigo(0);
		ncm2.setDescricao(null);
		System.out.println(ncm2);

		

		List<Produto> produtos = new ArrayList<Produto>();
		produto.add(ncm1);
		produto.add(ncm2);
		
		Localidade localidade = new Localidade(null, null, null);
		
		Impostos impostos = new Impostos();
		impostos.setDescrição(null);
		impostos.setCodigo_Prod(produto);
		impostos.setData(null);
		impostos.setLOCALIDADE(localidade);
		impostos.setBase_Legal(false);
		System.out.println(impostos);
		
		System.out.println("Mensagem de teste: " + localidade);

	}

}
