package br.com.devmedia.seam3.bean;

import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.seam.solder.core.Exact;
import org.jboss.seam.solder.el.Expressions;

import br.com.devmedia.cditest.autenticador.Autenticador;
import br.com.devmedia.cditest.autenticador.LDAPAutenticador;
import br.com.devmedia.seam3.parsers.MarkdownParser;
import br.com.devmedia.seam3.parsers.Parser;

@Named
public class ChamadorDeBeans {
    
    @Inject
    private MeuBean bean;
    @Inject @Exact(LDAPAutenticador.class)
    private @Any Autenticador autenticador;
    @Inject @Exact(MarkdownParser.class)
    private Parser parser;
    @Inject
    private Expressions expressions;
    
    public MeuBean getBean() {
        System.out.println(autenticador);
        System.out.println(parser);
        return bean;
    }
    
    public int getIdade() {
        Usuario usuario = expressions.evaluateValueExpression("#{usuario}");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getIdade());
        return usuario.getIdade();
    }
    

}
