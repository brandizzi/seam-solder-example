package br.com.devmedia.seam3.qualificadores;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MeuQualificador {

}
