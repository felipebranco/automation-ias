package core;

import java.util.Random;

public class Propriedades {

    public static boolean FECHAR_BROWSER = true;

    public static Browsers browser = Browsers.CHROME;

   public enum Browsers {
        CHROME,
        FIREFOX
    }

    public static String gera_email(){
        Random r = new Random();
        int num = r.nextInt();
        if (num < 0)
            num = num * (-1);
        return  "teste" + num + "@teste" + num + ".com.br";
    }

}

