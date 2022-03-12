package com.github.jcarloscody.validation;

import com.github.jcarloscody.validation.constraintvalidation.NotEmptyListValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//para ser verificado em tempo de execucao
@Target(ElementType.FIELD)//vai dizer onde podemos colocar esta anotacao, neste caso esta dizendo que é para colocar sobre um campo
@Constraint(validatedBy = NotEmptyListValidator.class) //aqui está informando que esta é uma anotacao de validacao e precimos criar uma classe q ira implementar uma interface e passamos a class que irá fazer a validacao. ou seja quem de fato valida o campo é a anotacao
public @interface NotEmptyList {

    String message() default  "A lista nao pode ser vazia";  //uma mensagem padrao
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
