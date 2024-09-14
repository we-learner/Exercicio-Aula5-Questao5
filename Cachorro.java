package com.mycompany.questao_5;

public class Cachorro extends Animal
{
    public Cachorro(String nome)
    {
        super(nome);
    }

    @Override
    public void emitirSom()
    {
        System.out.println(getNome() + " diz: Au! Au!");
    }

    @Override
    public void mover()
    {
        System.out.println(getNome() + " esta correndo.");
    }
}
