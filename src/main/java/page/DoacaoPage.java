package page;

import core.BasePage;
import org.openqa.selenium.By;

public class DoacaoPage extends BasePage {

    //Dados cadastrais Pessoa Física
    public void setDoadorNome(String nomedoador) {
        escreve("DoadorNome", nomedoador);
    }

    public void setDoadorSobrenome(String sobrenomedoador) {
        escreve("DoadorSobrenome", sobrenomedoador);
    }

    public void setEmailDoador(String emaildoador) {
        escreve("DoadorEmail0Email", emaildoador);
    }

    public void setSenha(String Senha) {
        escreve("UserPassword", Senha);
    }

    public void setConfirmaSenha(String ConfirmaSenha) {
        escreve("UserTemppassword", ConfirmaSenha);
    }

    public void setTelefone(String Telefone) {
        escreve("DoadorTelefone0Numero", Telefone);
    }

    public void setCPF(String CPF){ escreve ("doadorCpf", CPF); }

    public void setDoacaoValor(String DoacaoValor){ escreve("DoacaoValor", DoacaoValor);}

   //Forma de Pagamento

    public void setCartaodeCredito (){
        clicarRadio("credito");
    }

    public void setDébitoemConta (){
        clicarRadio("debito");
    }

    // Selecione uma bandeira
    public void setVisa(){ clicarRadio(By.xpath("//*[@id='credito']/div[1]/div/ul/li[1]/div/input")); }

    public void setNomeCartao(String nomecartao) {
        escreve("PagamentoCartaoCreditoNome", nomecartao);
    }

    public void setNumerocartao(String numerocartao) {
        escreve("cartaoCreditoNum", numerocartao);
    }

    public void setCartaocodigo(String codigo) {escreve("cartaoCreditoCod", codigo);
    }

    // Validade do cartão
    public void setMes(String validames, String valor) {
        selecionarCombo("validade-mes", "12");
    }

    public void setAno(String validadeano, String valor) {
        selecionarCombo("validade-ano", "2027");
    }

    //Selecione um banco

    public void setItau(){
        clicarRadio(By.xpath("//*[@id='debito']/div[1]/div/ul/li[1]/div/input"));
    }

    public void SetMelhorDiaDebito(String debito, String valor) {
        selecionarCombo("data-debito", "1");
    }

    public void setdebitoAgencia(String debitoAgencia) {
        escreve("debitoAgencia", debitoAgencia);
    }

    public void setContao(String Conta) {
        escreve("debitoConta", Conta);
    }

    //checkbox Termos
    public void checkboxrTermos() {
        clicarCheck("terms", "terms");
    }

    public void Concluirdoacao() { clicarBotao("enviar_doacao"); }

    public String obterMensagemSucesso(){
        return obterTexto(By.xpath("/html/body/div[1]/div/div[2]/div/div/p[2]/text()']"));
    }

    //Mensagens de Erro PF

    public String obterMensagemErroNome(){return obterTexto(By.xpath("//*[@id='dadosPessoais']/div[2]/div[2]/small"));    }

    public String obterMensagemErroSobrenome(){return obterTexto(By.xpath("//*[@id='dadosPessoais']/div[2]/div[3]/small"));}

    public String obterMensagemErroEmail(){return obterTexto(By.xpath("//*[@id='dadosPessoais']/div[3]/div[1]/small")); }

    public String obterMensagemErroSenha(){ return obterTexto(By.xpath("//*[@id='dadosPessoais']/div[4]/div[1]/small"));}

    public String obterMensagemErroTelefoneResidencial(){return obterTexto(By.xpath("//*[@id='dadosPessoais']/div[5]/div[1]/small")); }

    public String obterMensagemErroCPF(){return obterTexto(By.xpath("//*[@id='dadosPessoais']/div[5]/div[2]/small")); }

    public String obterMensagemErroNomeCartao(){return obterTexto(By.xpath("//*[@id='credito']/div[2]/div/small")); }

    public String obterMensagemErroNumeroCartao(){return obterTexto(By.xpath("//*[@id='credito']/div[3]/div[1]/small")); }

    public String obterMensagemErroCodigoSeguranca(){return obterTexto(By.xpath("//*[@id='credito']/div[3]/div[2]/small")); }

    public String obterMensagemErroTermos(){return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[4]/div[1]/small")); }

    //Mensagens de Erro PJ

    public String obterMensagemErroRazaoSocial(){return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[4]/span")); }

    public String obterMensagemErroCNPJ() { return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[5]/span")); }

    public String obterMensagemErroNomeContato() { return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[6]/span")); }

    public String obterMensagemErroCargo() { return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[7]/span")); }

    public String obterMensagemEmailContato() { return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[10]/small")); }

    public String obterMensagemNomeRepresentante() { return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[13]/small")); }

    public String obterMensagemEmailRepresentante() { return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[14]/small")); }

    public String obterMensagemErroSenhaPJ(){ return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[11]/small"));}

    public String obterMensagemErroTelefonePrincipal(){ return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[1]/div[9]/small"));}

    public String obterMensagemErroNomeCartaoPJ(){return obterTexto(By.xpath("//*[@id='credito']/div[2]/div/small")); }

    public String obterMensagemErroNumeroCartaoPJ(){return obterTexto(By.xpath("//*[@id='credito']/div[3]/div[1]/small")); }

    public String obterMensagemErroCodigoSegurancaPJ(){return obterTexto(By.xpath("//*[@id='credito']/div[3]/div[2]/small")); }

    public String obterMensagemErroTermosPJ(){return obterTexto(By.xpath("//*[@id='formDoacao']/fieldset/div[4]/div[1]/small")); }

    public void Sair(){
        clicarBotao(By.xpath("//*[@id='header']/div/div[3]/a[1]"));
    }

    //Dados cadastrais Pessoa Juridica
    public void setCNPJ(String CNPJ) {
        escreve("DoadorCpfCnpj", CNPJ);
    }

    public void setSexo(String sexo, String valor) {
        selecionarCombo("DpjComplementoSexo", "Masculino");
    }

    public void setNomeContato(String NomeContato) {
        escreve("DpjComplementoNome", NomeContato);
    }

    public void setCargo(String Cargo) {
        escreve("DpjComplementoCargo", Cargo);
    }

    public void setNomeRepresentante(String NomeRepresentante) {
        escreve("DpjComplementoRepresentante", NomeRepresentante);
    }

    public void setEmailRepresentante(String EmailRepresentante) {
        escreve("DoadorEmail1Email", EmailRepresentante);
    }

    public void setFaixaFaturamentoAnual(String faturamentoanual, String FaixaFaturamentoAnual) {
        selecionarCombo("DpjComplementoFaixaId", "Até R$ 60.000");
    }
    public void setNatureza(String natureza, String NaturezaJuridica) {
        selecionarCombo("DpjComplementoNaturezaId", "214-3 - Cooperativa");
    }

}
