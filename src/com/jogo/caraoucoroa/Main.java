package com.jogo.caraoucoroa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String caraOuCoroa = "Cara:Coroa";
        Random random = new Random();

        String resultado = caraOuCoroa.split(":")[random.nextInt(2)];

        escrever(resultado);
    }

    private static void escrever(String texto) {
        System.out.println(texto);
    }
}
