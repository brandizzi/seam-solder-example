package br.com.devmedia.seam3.bean;

import javax.inject.Named;

@Named
public class Usuario {
    private String nome;
    private int idade;
    
    public Usuario() {
        this.nome = "João";
        this.idade = 12;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String saudar() {
        return "Olá, meu nome é " + nome;
    }
}
