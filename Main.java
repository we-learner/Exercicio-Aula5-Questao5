package com.mycompany.questao_5;

public class Main
{
    public static void main(String[] args)
    {
        Animal cachorro = new Cachorro("Cleitinho Fuba");
        Animal gato = new Gato("Raimundo Neto");

        cachorro.emitirSom();
        cachorro.mover();

        gato.emitirSom();
        gato.mover();
    }
}

