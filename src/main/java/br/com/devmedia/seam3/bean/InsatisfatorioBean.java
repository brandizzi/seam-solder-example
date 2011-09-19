package br.com.devmedia.seam3.bean;

import javax.inject.Inject;

import org.jboss.seam.solder.core.Requires;

@Requires("br.com.devmedia.seam3.bean.NoBeanImpl")
public class InsatisfatorioBean {

    @Inject private NoBean noBean;
    
    public String getNome() {
        return NoBean.class.getName();
    }

}
