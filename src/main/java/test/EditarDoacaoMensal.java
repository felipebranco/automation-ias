package test;

import core.BaseTest;
import core.DriveFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import page.*;

public class EditarDoacaoMensal extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DoacaoPagamentoCartão pagamentoCartão = new DoacaoPagamentoCartão();
    DoacaoPagamentoDébito pagamentoDébito = new DoacaoPagamentoDébito();
    DoacaoPage page = new DoacaoPage();
    AdminPage adminPage = new AdminPage();

    @Test
    public void EditarValorDoaçao() {

        loginPage.Logar();
        page.clicarBotao(By.xpath("//*[@id='formLogin']/fieldset/div[4]/div/button"));
        page.clicarBotao("bt-aumentar-doacao");
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/doacoes/31009");
        page.setDoacaoValor("100,00");
        page.clicarBotao(By.xpath("//*[@id='salvarDados']/div/input"));
        page.Sair();

    }

    @Test
    public void AlterarFormadePagamentoDoacaoCartao(){
        loginPage.Logar();
        page.clicarBotao(By.xpath("//*[@id='formLogin']/fieldset/div[4]/div/button"));
        page.clicarBotao("bt-aumentar-doacao");
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/doacoes/31009");
        page.clicarCheck("alterarFormaPagamento", "alterarFormaPagamento");
        page.clicarRadio(By.id("credito"));
        page.clicarRadio(By.id("forma-pagamento-3"));
        page.setNomeCartao("Teste Teste");
        page.setNumerocartao("0000000000000001");
        page.setCartaocodigo("123");
        page.setMes("12", "12");
        page.setAno("2027", "2027 ");
        page.clicarBotao(By.xpath("//*[@id='salvarDados']/div/input"));
        page.Sair();
        }

        @Test
        public void EditarValorDoaçaoAdmin() {
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/admin");
        adminPage.Logaradmin();
        page.clicarBotao(By.xpath("//*[@id='formLogin']/fieldset/div[4]/div/button"));
        page.clicarBotao(By.xpath("/html/body/div/div/nav/section[1]/a"));
        page.clicarBotao(By.xpath("/html/body/div/div/aside/ul/li[3]/a"));
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/admin/doacoes/alterar/30977");
        page.setDoacaoValor("100,00");
        page.clicarBotao(By.xpath("//*[@id='salvarDados']/div/input"));
        Assert.assertEquals("Suas alterações foram salvas. Caso a doação seja mensal, a alteração só terá efeito a partir da próxima parcela.", "Suas alterações foram salvas. Caso a doação seja mensal, a alteração só terá efeito a partir da próxima parcela.");
        page.clicarBotao(By.xpath("/html/body/div/div/nav/section[1]/a"));
        page.clicarBotao(By.xpath("/html/body/div/div/aside/ul/li[22]/label/a"));
        page.Sair();

    }

    @Test
    public void AlterarFormadePagamentoDoacaoCartaoAdmin(){
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/admin");
        adminPage.Logaradmin();
        page.clicarBotao(By.xpath("//*[@id='formLogin']/fieldset/div[4]/div/button"));
        page.clicarBotao(By.xpath("/html/body/div/div/nav/section[1]/a"));
        page.clicarBotao(By.xpath("/html/body/div/div/aside/ul/li[3]/a"));
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/admin/doacoes/alterar/30977");
        page.clicarCheck("alterarFormaPagamento", "alterarFormaPagamento");
        page.clicarRadio(By.id("credito"));
        page.clicarRadio(By.id("panel1"));
        page.setNomeCartao("Teste Teste");
        page.setNumerocartao("0000000000000001");
        page.setCartaocodigo("123");
        page.setMes("12", "12");
        page.setAno("2027", "2027 ");
        page.clicarBotao(By.xpath("//*[@id='salvarDados']/div/input"));
        Assert.assertEquals("Suas alterações foram salvas. Caso a doação seja mensal, a alteração só terá efeito a partir da próxima parcela.", "Suas alterações foram salvas. Caso a doação seja mensal, a alteração só terá efeito a partir da próxima parcela.");
        page.clicarBotao(By.xpath("/html/body/div/div/nav/section[1]/a"));
        page.clicarBotao(By.xpath("/html/body/div/div/aside/ul/li[22]/label/a"));
    }


}


