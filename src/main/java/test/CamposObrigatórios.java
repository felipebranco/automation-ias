package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.DoacaoPage;
import page.MenuPage;

public class CamposObrigatórios extends BaseTest {

    DoacaoPage doacao = new DoacaoPage();
    MenuPage menu = new MenuPage();

    @Test
    public void CamposObrigatoriosPF(){
    menu.DoaçãoPessoaFisicaMensal30();
    doacao.setDoadorNome("");
    doacao.setDoadorSobrenome("");
    doacao.setEmailDoador("");
    doacao.setSenha("");
    doacao.setConfirmaSenha("");
    doacao.setTelefone("");
    doacao.setCPF("");
    doacao.setCartaodeCredito();
    doacao.setVisa();
    doacao.setNomeCartao("");
    doacao.setNumerocartao("");
    doacao.setCartaocodigo("");
    doacao.setMes("", "");
    doacao.setAno("", "");
    doacao.Concluirdoacao();
        Assert.assertEquals("Preencha seu Nome", doacao.obterMensagemErroNome()); // Nome
        Assert.assertEquals("Preencha seu Sobrenome", doacao.obterMensagemErroSobrenome()); // Sobrenome
        Assert.assertEquals("Preencha com um email válido", doacao.obterMensagemErroEmail()); // E-mail
        Assert.assertEquals("Sua senha deve conter ao menos 6 caracteres, sem espaço entre eles.", doacao.obterMensagemErroSenha()); // Senha
        Assert.assertEquals("Formato Inválido", doacao.obterMensagemErroTelefoneResidencial()); // Telefone Residencial
        Assert.assertEquals("Formato Inválido", doacao.obterMensagemErroCPF()); //CPF
        Assert.assertEquals("Campo Obrigatório", doacao.obterMensagemErroNomeCartao()); //Nome cartão
        Assert.assertEquals("Campo Obrigatório", doacao.obterMensagemErroNumeroCartao()); //Número cartão
        Assert.assertEquals("Campo Obrigatório", doacao.obterMensagemErroCodigoSeguranca()); //Código de Segurança
        Assert.assertEquals("Você precisa aceitar os termos e condições para prosseguir.", doacao.obterMensagemErroTermos()); // Termos
    }

    @Test
    public void CamposObrigatoriosPJ() {
        menu.DoaçãoPessoaJuridicaMensal1200();
        doacao.setDoadorNome(""); //Nome Fantasia
        doacao.setDoadorSobrenome(""); //Razão Social
        doacao.setCNPJ("");
        doacao.setNomeContato("");
        doacao.setCargo("");
        doacao.setSexo("", "");
        doacao.setTelefone("");
        doacao.setEmailDoador("");
        doacao.setSenha("");
        doacao.setConfirmaSenha("");
        doacao.setNomeRepresentante("");
        doacao.setEmailRepresentante("");
        doacao.setFaixaFaturamentoAnual("", "");
        doacao.setNatureza("", "");
        doacao.setCartaodeCredito();
        doacao.setVisa();
        doacao.setNomeCartao("");
        doacao.setNumerocartao("");
        doacao.setCartaocodigo("");
        doacao.setMes("", "");
        doacao.setAno("", "");
        doacao.Concluirdoacao();
        Assert.assertEquals("Preenchimento Obrigatório", doacao.obterMensagemErroRazaoSocial()); // Razão Social
        Assert.assertEquals("Preenchimento Obrigatório", doacao.obterMensagemErroCNPJ()); // CNPJ
        Assert.assertEquals("Preenchimento Obrigatório", doacao.obterMensagemErroNomeContato()); //Nome do Contato
        Assert.assertEquals("Preenchimento Obrigatório", doacao.obterMensagemErroCargo()); // Cargo
        Assert.assertEquals("Formato Inválido", doacao.obterMensagemErroTelefonePrincipal()); //Telefone Principal
        Assert.assertEquals("Preencha com um email válido", doacao.obterMensagemEmailContato()); //Email contato
        Assert.assertEquals("Sua senha deve conter ao menos 6 caracteres, sem espaço entre eles.", doacao.obterMensagemErroSenhaPJ()); //Senha
        Assert.assertEquals("Campo Obrigatório", doacao.obterMensagemNomeRepresentante()); // Nome Representante
        Assert.assertEquals("Preencha com um email válido", doacao.obterMensagemEmailRepresentante()); // Email Representante
        Assert.assertEquals("Campo Obrigatório", doacao.obterMensagemErroNomeCartaoPJ()); //Nome cartão
        Assert.assertEquals("Campo Obrigatório", doacao.obterMensagemErroNumeroCartaoPJ()); //Número cartão
        Assert.assertEquals("Campo Obrigatório", doacao.obterMensagemErroCodigoSegurancaPJ()); //Código de Segurança
        Assert.assertEquals("Você precisa aceitar os termos e condições para prosseguir.", doacao.obterMensagemErroTermosPJ()); // Termos
    }
}


