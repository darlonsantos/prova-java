package br.com.confidencecambio.javabasico.model;

public class Imc {

    private float peso;
    private float altura;

    private float imc;


    public Imc() {}

    public Imc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }



    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    // Faz a divisão entre o peso e altura.
    public void imcCalculate() {
        this.imc = (float) (this.peso / (Math.pow(this.altura, 2)));
    }

}
