package page;

import core.Propriedades;
import utils.GeraCNPJ;
import utils.GeraCPF;

public class DoacaoCadastro {

     DoacaoPage doacao = new DoacaoPage();
     GeraCNPJ gerador = new GeraCNPJ();

     public void DoaçãoPessoaFisica() {

        doacao.setDoadorNome("Teste");
        doacao.setDoadorSobrenome("Teste");
        doacao.setEmailDoador(Propriedades.gera_email());
        doacao.setSenha("123456");
        doacao.setConfirmaSenha("123456");
        doacao.setTelefone("1633333333");
        doacao.setCPF(GeraCPF.geraCPF());
    }

    public void DoaçãoPessoaJuridica() {

        doacao.setDoadorNome("Teste"); //Nome Fantasia
        doacao.setDoadorSobrenome("Teste"); //Razão Social
        doacao.setCNPJ(gerador.cnpj());
        doacao.setNomeContato("Teste");
        doacao.setCargo("Analista de Teste");
        doacao.setSexo("Masculino", "Masculino");
        doacao.setTelefone("1633333333");
        doacao.setEmailDoador(Propriedades.gera_email());
        doacao.setSenha("123456");
        doacao.setConfirmaSenha("123456");
        doacao.setNomeRepresentante("Felipe Teste");
        doacao.setEmailRepresentante(Propriedades.gera_email());
        doacao.setFaixaFaturamentoAnual( "Até R$ 60.000", "Até R$ 60.000");
        doacao.setNatureza ("214-3 - Cooperativa", "214-3 - Cooperativa");
    }
}
