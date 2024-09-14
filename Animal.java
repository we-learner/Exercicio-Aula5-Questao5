package com.mycompany.questao_5;

public abstract class Animal
{
    private String nome;

    public Animal(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public abstract void emitirSom();

    public abstract void mover();
}
