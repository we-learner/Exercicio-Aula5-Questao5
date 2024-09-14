package com.mycompany.questao_5;

public class Gato extends Animal
{
    public Gato(String nome)
    {
        super(nome);
    }

    @Override
    public void emitirSom()
    {
        System.out.println(getNome() + " diz: Miau!");
    }

    @Override
    public void mover()
    {
        System.out.println(getNome() + " esta andando silenciosamente.");
    }
}

