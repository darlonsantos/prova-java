package br.com.confidencecambio.javabasico.model;

import br.com.confidencecambio.javabasico.config.Config;

public class nomeTest {

    public static String NOME_CLIENTE =  "Darlon Santos Carvalho ";
    public static String NOME_GERENTE =  "Ana chelia Soares Carvalho ";
    public static String NOME_ROBO =  "Sophia Soares Carvalho";

    public static void main(String[] args)  {



        final String nomeCliente = NOME_CLIENTE;
        final String nomeGerente = NOME_GERENTE;
        final String nomeRobo = NOME_ROBO;

        Config cli  = null;
        Config ger  = null;
        Config rob  = null;


        try {
            cli  = new Cliente(nomeCliente);
            ger = new Gerente(nomeGerente);
            rob = new Robo(nomeRobo);
        } catch (Exception  e) {
            System.out.println(e.getMessage());
        }



        try {
            System.out.println("PRIMEIRO NOME! \n");
            System.out.println(cli.retornaPrimeiroNome());
            System.out.println(ger.retornaPrimeiroNome());
            System.out.println(rob.retornaPrimeiroNome());

            System.out.println("ÚLTIMO NOME! \n");
            System.out.println(cli.retornaUltimoNome());
            System.out.println(ger.retornaUltimoNome());
            System.out.println(rob.retornaUltimoNome());

            System.out.println("NOME MAIÚSCULO! \n");
            System.out.println(cli.retornaNomeMaiusculo());
            System.out.println(ger.retornaNomeMaiusculo());
            System.out.println(rob.retornaNomeMaiusculo());

            System.out.println("NOME ABREVIADO! \n");
            System.out.println(cli.retornaNomeAbreviado());
            System.out.println(ger.retornaNomeAbreviado());
            System.out.println(rob.retornaNomeAbreviado());

        } catch (Exception  e) {
            System.out.println(e.getMessage());
        }


    }

}
