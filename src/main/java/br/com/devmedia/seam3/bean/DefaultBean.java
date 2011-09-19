package br.com.devmedia.seam3.bean;

import org.jboss.seam.solder.core.Veto;

@Veto
public class DefaultBean implements MeuBean {

    private String nome = "d";

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
