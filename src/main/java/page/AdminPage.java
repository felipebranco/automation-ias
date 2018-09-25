package page;

import core.BasePage;

public class AdminPage extends BasePage {

    public void Logaradmin() {
        escreve("AdminEmail", "email admin"); // usuário admin disponível no BitBucket
        escreve("AdminPassword", "senha admin"); //senha admin disponível no BitBucket
    }
}
