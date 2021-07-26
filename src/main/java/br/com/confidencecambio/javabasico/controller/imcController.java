package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.Imc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class imcController {


    @GetMapping("/imcResult")
    public Map<String, String> calculeImc(@RequestParam Map<String, String> allParams) {
        HashMap<String, String> map = new HashMap<>();
        try {
             //recebi o o peso  como parâmetro
            float peso = Float.parseFloat(allParams.get("peso"));
            // recebi o altura como parâmetro
            float altura = Float.parseFloat(allParams.get("altura"));
            Imc imc = new Imc(peso, altura);
            imc.imcCalculate();
            map.put("imc", Float.toString(imc.getImc()));
            return map;
        } catch (Exception exception) {
            map.clear();
            map.put("error", "Erro mostrar resultando...");
            return map;
        }
    }


}
