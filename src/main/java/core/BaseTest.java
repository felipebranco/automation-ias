package core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import page.HomePage;

import java.io.File;
import java.io.IOException;
import static core.DriveFactory.getDriver;
import static core.DriveFactory.killDriver;

public class BaseTest {

    @Rule
    public TestName testName = new TestName();
    public HomePage page = new HomePage();

    @Before

    public void inicializa(){
        page.acessarTelaInicial();
    }

    @After
    public void finaliza() throws IOException{
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
                File.separator + testName.getMethodName() + ".jpg"));

        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }

}
