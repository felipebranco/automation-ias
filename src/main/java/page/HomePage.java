package page;

import core.BasePage;
import core.DriveFactory;

public class HomePage extends BasePage {

    public void acessarTelaInicial(){
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/");
    }

}
