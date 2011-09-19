package br.com.devmedia.seam3.bean;

import javax.enterprise.inject.Produces;

public class ProdutorDeBean {
    @Produces
    public MeuBean getMeuBean() {
        DefaultBean bean = new DefaultBean();
        bean.setNome("bean do método produtor");
        return bean;
    }
}
