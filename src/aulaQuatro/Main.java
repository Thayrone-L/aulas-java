package aulaQuatro;

import java.awt.*
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Date relogio = new Date();
        System.out.println(relogio.toString());
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        System.out.println("Instalado: " +osName+" Versão: " + osVersion);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int largura =  (int)screenSize.getWidth();
        int altura = (int)screenSize.getHeight();
        System.out.println("Sua resolução é " + largura + " X " + altura);
        Locale loc = Locale.getDefault();
        System.out.println("Seu idioma é: " + loc);

    }
}
