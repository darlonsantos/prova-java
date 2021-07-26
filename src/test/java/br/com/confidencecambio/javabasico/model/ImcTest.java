package br.com.confidencecambio.javabasico.model;

import org.junit.Before;
import org.junit.Test;

public class ImcTest    {

    private float peso;
    private float altura;

    private float imc;



    @Test
    public void imcCalculate() {
        this.peso =  75;
        this.altura =  Float.parseFloat("1.78");
        this.imc = (float) (this.peso / (Math.pow(this.altura, 2)));

    }

}
