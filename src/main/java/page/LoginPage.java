package page;

import core.BasePage;

public class LoginPage extends BasePage {

    MenuPage page = new MenuPage();

    public void Logar() {
        page.Logar();
        escreve("UserEmail", "teste51@teste51.com.br");
        escreve("UserPassword", "teste@123");
    }



}
