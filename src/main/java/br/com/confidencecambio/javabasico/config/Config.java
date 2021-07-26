package br.com.confidencecambio.javabasico.config;

public abstract  class Config {

    private String nome;



    protected Config(String nome) throws Exception {
        this.nome = nome;
        validar();
    }


    public String retornaPrimeiroNome() {
        return  getClass().getSimpleName() + ": " + nome.split(" ")[0].trim();
    }

    public String retornaUltimoNome() {
        String[] separado = nome.split(" ");
        return  getClass().getSimpleName() + ": " + separado[separado.length - 1].trim();
    }

    public String retornaNomeMaiusculo() {
        return  getClass().getSimpleName() + ": " + this.nome.toUpperCase().trim();
    }

    public String retornaNomeAbreviado() {
        String abreviado="";
        String[] separado = nome.split(" ");

        /*
        * Pega o primeiro nome
        * */
        abreviado+= separado[0] + " ";

        /*
        *  Abreviação do nome
        * */
        for (int i=1;i < separado.length-1;i++) {
            abreviado += separado[i].charAt(0) + ". ";
        }

        /*
        * Pega o último nome
        *
        * */
        abreviado+= separado[separado.length-1];
        return getClass().getSimpleName() + ": " + abreviado.trim();
    }

    private void validar() throws Exception {
        if ((nome == null) || nome.isBlank() || nome.isEmpty() ) {
            throw new Exception(getClass().getSimpleName() + ": Nome não pode ser null.");

        }

    }

}
