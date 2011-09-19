package br.com.devmedia.seam3._catch;

import javax.enterprise.inject.Model;

@Model
public class FaltosoBean {
    
    public String lanca() throws FalhaOcorreuException {
        if (1 == 2-1)
            throw new FalhaOcorreuException("Que falha!");
        return "lanca";
    }

}
