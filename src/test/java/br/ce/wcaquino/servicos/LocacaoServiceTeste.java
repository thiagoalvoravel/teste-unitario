package br.ce.wcaquino.servicos;

import java.util.Date;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTeste {
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Test
	public void teste() {
		//cenário
		Usuario usuario = new Usuario("João");
		Filme filme = new Filme("Tubarão", 3, 2.5);
		LocacaoService locacaoService = new LocacaoService();
		
		//acao
		Locacao locacaoTubarao = locacaoService.alugarFilme(usuario, filme);
		
		//verificação
		error.checkThat(filme.getPrecoLocacao(), is(equalTo(locacaoTubarao.getValor())));
		error.checkThat(DataUtils.isMesmaData(locacaoTubarao.getDataLocacao(), new Date()), is(true));
		
	}

}
