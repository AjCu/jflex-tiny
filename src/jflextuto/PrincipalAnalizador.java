package jflextuto;

import java.io.File;

public class PrincipalAnalizador {

    public static void main(String[] args) {
        String ruta = "C:/Development/Personal AJCU/Java Stuff/jflex-primer-parcial/src/jflextuto/tiny.flex";
        generarLexer(ruta);

    }

    public static void generarLexer(String ruta) {
        File file = new File(ruta);
        JFlex.Main.generate(file);
    }
}
