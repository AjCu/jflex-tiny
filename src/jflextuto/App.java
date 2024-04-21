package jflextuto;

import java_cup.runtime.Symbol;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Development\\Personal AJCU\\Java Stuff\\jflex-primer-parcial\\test\\tiny_test"));
        Tiny lex = new Tiny(reader);
        Symbol t;
        do {
            t = lex.yylex();
            if (t != null) {
                System.out.println(
                        "| Token = " + t.sym + " ; lexema = " + (String) t.value + " | Tiny = " + getTiny(t.sym));

            } else {
                System.out.println("EOF");

            }
        } while (t != null);
        System.out.println("Fin");
    }

    public static String getTiny(int n_token) {
        switch (n_token) {
            case 2:
                return "RESERVADA";
            case 7:
                return "NUMERO";
            default:
                return "OTRO";
        }
    }
}
