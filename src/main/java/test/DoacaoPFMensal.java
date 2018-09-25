package test;

import core.BaseTest;
import org.junit.Test;
import page.*;

public class DoacaoPFMensal extends BaseTest{

        MenuPage menu = new MenuPage();
        DoacaoPage doacao = new DoacaoPage();
        DoacaoCadastro doacaoCadastro = new DoacaoCadastro();
        DoacaoPagamentoCartão pagamentoCartão = new DoacaoPagamentoCartão();
        DoacaoPagamentoDébito pagamentoDébito = new DoacaoPagamentoDébito();

        @Test
        public void DoaçãoPessoaFisicaMensal30Cartao(){
            menu.DoaçãoPessoaFisicaMensal30();
            doacaoCadastro.DoaçãoPessoaFisica();
            pagamentoCartão.PagamentoCartao();
            doacao.checkboxrTermos();
            doacao.Concluirdoacao();
            doacao.Sair();
        }

        @Test
        public void DoaçãoPessoaFisicaMensal50Cartao(){
            menu.DoaçãoPessoaFisicaMensal50();
            doacaoCadastro.DoaçãoPessoaFisica();
            pagamentoCartão.PagamentoCartao();
            doacao.checkboxrTermos();
            doacao.Concluirdoacao();
            doacao.Sair();
    }

       @Test
        public void DoaçãoPessoaFisicaMensal90Cartao(){
            menu.DoaçãoPessoaFisicaMensal90();
            doacaoCadastro.DoaçãoPessoaFisica();
            pagamentoCartão.PagamentoCartao();
            doacao.checkboxrTermos();
            doacao.Concluirdoacao();
            doacao.Sair();
    }

}
