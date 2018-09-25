package page;

import core.BasePage;
import org.openqa.selenium.By;

public class MenuPage extends BasePage {

    public void DoaçãoPessoaFisicaMensal30() {
        clicarBotaoName("PF");
        clicarLink("mensal");
        clicarBotaoValor("//*[@id='monthly']/div/div[1]");
        clicarBotaoName("novo");

    }

    public void DoaçãoPessoaFisicaMensal50() {
        clicarBotaoName("PF");
        clicarLink("mensal");
        clicarBotaoValor("//*[@id='monthly']/div/div[2]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaFisicaMensal90() {
        clicarBotaoName("PF");
        clicarLink("mensal");
        clicarBotaoValor("//*[@id='monthly']/div/div[3]");

        //*[@id="monthly"]/div/div[1]/p
        clicarBotaoName("novo");

    }

    public void DoaçãoPessoaFisicaUnica120() {
        clicarBotaoName("PF");
        clicarLink("única");
        clicarBotaoValor("//*[@id='single']/div/div[1]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaFisicaUnica240() {
        clicarBotaoName("PF");
        clicarLink("única");
        clicarBotaoValor("//*[@id='single']/div/div[2]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaFisicaUnica360() {
        clicarBotaoName("PF");
        clicarLink("única");
        clicarBotaoValor("//*[@id='single']/div/div[3]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaJuridicaMensal360() {
        clicarBotaoName("PJ");
        clicarLink("mensal");
        clicarBotaoValor("//*[@id='monthly']/div/div[1]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaJuridicaMensal1200() {
        clicarBotaoName("PJ");
        clicarLink("mensal");
        clicarBotaoValor("//*[@id='monthly']/div/div[2]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaJuridicaMensal2400() {
        clicarBotaoName("PJ");
        clicarLink("mensal");
        clicarBotaoValor("//*[@id='monthly']/div/div[3]");
        clicarBotaoName("novo");

    }

    public void DoaçãoPessoaJuridicaUnica4320() {
        clicarBotaoName("PJ");
        clicarLink("única");
        clicarBotaoValor("//*[@id='single']/div/div[1]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaJuridicaUnica14400() {
        clicarBotaoName("PJ");
        clicarLink("única");
        clicarBotaoValor("//*[@id='single']/div/div[2]");
        clicarBotaoName("novo");
    }

    public void DoaçãoPessoaJuridicaUnica28800() {
        clicarBotaoName("PJ");
        clicarLink("única");
        clicarBotaoValor("//*[@id='single']/div/div[3]");
        clicarBotaoName("novo");
    }

    public void Logar() {
        clicarBotaoName(By.xpath("//*[@id='header']/div/div[3]/a[1]"));
    }
}


