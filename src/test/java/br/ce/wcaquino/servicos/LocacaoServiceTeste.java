package br.ce.wcaquino.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTeste {
	
	@Test
	public void teste() {
		Usuario usuario = new Usuario("João");
		Filme filme = new Filme("Tubarão", 3, 2.5);
		LocacaoService locacaoService = new LocacaoService();
		Locacao locacaoTubarao = locacaoService.alugarFilme(usuario, filme);
		
		Assert.assertTrue(locacaoTubarao.getValor() == 2.5);
		Assert.assertTrue(DataUtils.isMesmaData(locacaoTubarao.getDataLocacao(), new Date()));
		
	}

}
