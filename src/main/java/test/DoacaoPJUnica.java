package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.*;

public class DoacaoPJUnica extends BaseTest {

    HomePage homePage = new HomePage();
    MenuPage menu = new MenuPage();
    DoacaoPage doacao = new DoacaoPage();
    DoacaoCadastro doacaoCadastro = new DoacaoCadastro();
    DoacaoPagamentoCartão pagamentoCartão = new DoacaoPagamentoCartão();
    DoacaoPagamentoDébito pagamentoDébito = new DoacaoPagamentoDébito();

    @Test
    public void DoaçãoPessoaJuridicaUnica4320Cartao(){
        menu.DoaçãoPessoaJuridicaUnica4320();
        doacaoCadastro.DoaçãoPessoaJuridica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();

    }

    @Test
    public void DoaçãoPessoaJuridicaUnica14400Cartao(){
        menu.DoaçãoPessoaJuridicaUnica14400();
        doacaoCadastro.DoaçãoPessoaJuridica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();
    }

    @Test
    public void DoaçãoPessoaJuridicaUnica28800Cartao(){
        menu.DoaçãoPessoaJuridicaUnica28800();
        doacaoCadastro.DoaçãoPessoaJuridica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();
    }

}
