package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.*;

public class DoacaoPJMensal extends BaseTest {

    HomePage homePage = new HomePage();
    MenuPage menu = new MenuPage();
    DoacaoPage doacao = new DoacaoPage();
    DoacaoCadastro doacaoCadastro = new DoacaoCadastro();
    DoacaoPagamentoCartão pagamentoCartão = new DoacaoPagamentoCartão();
    DoacaoPagamentoDébito pagamentoDébito = new DoacaoPagamentoDébito();

    @Test
    public void DoaçãoPessoaJuridicaMensal360Cartao(){
        menu.DoaçãoPessoaJuridicaMensal360();
        doacaoCadastro.DoaçãoPessoaJuridica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();

    }

    @Test
    public void DoaçãoPessoaJuridicaMensal1200Cartao(){
        menu.DoaçãoPessoaJuridicaMensal1200();
        doacaoCadastro.DoaçãoPessoaJuridica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();
    }

    @Test
    public void DoaçãoPessoaJuridicaMensal2400Cartao(){
        menu.DoaçãoPessoaJuridicaMensal2400();
        doacaoCadastro.DoaçãoPessoaJuridica();
        pagamentoCartão.PagamentoCartao();
        doacao.checkboxrTermos();
        doacao.Concluirdoacao();
        doacao.Sair();
    }

}
