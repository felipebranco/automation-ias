package test;

import core.BaseTest;
import org.junit.Test;
import page.*;

public class DoacaoPFUnica extends BaseTest {

    HomePage homePage = new HomePage();
    MenuPage menu = new MenuPage();
    DoacaoPage doacao = new DoacaoPage();
    DoacaoCadastro doacaoCadastro = new DoacaoCadastro();
    DoacaoPagamentoCartão pagamentoCartão = new DoacaoPagamentoCartão();
    DoacaoPagamentoDébito pagamentoDébito = new DoacaoPagamentoDébito();

    @Test
    public void DoaçãoPessoaFisicaUnica120Cartao() {
        menu.DoaçãoPessoaFisicaUnica120();
        doacaoCadastro.DoaçãoPessoaFisica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();
    }



    @Test
    public void DoaçãoPessoaFisicaUnica240Cartao() {
        menu.DoaçãoPessoaFisicaUnica240();
        doacaoCadastro.DoaçãoPessoaFisica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();
    }

    @Test
    public void DoaçãoPessoaFisicaUnica360Cartao() {
        menu.DoaçãoPessoaFisicaUnica360();
        doacaoCadastro.DoaçãoPessoaFisica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();
    }

}
