package suites;

import org.junit.AfterClass;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import core.DriveFactory;
import test.*;


@RunWith(Suite.class)
@SuiteClasses({
        DoacaoPFMensal.class,
        DoacaoPFUnica.class,
        DoacaoPJMensal.class,
        DoacaoPJUnica.class,
        EditarDoacaoMensal.class,
        CamposObrigatórios.class

})

public class TestRunner {

    @Before
    public void acessarTelaInicial(){
        DriveFactory.getDriver().get("https://homolog.doeeducacao.org.br/");
    }

    @AfterClass
    public static void finaliza(){
        DriveFactory.killDriver();
    }
}
