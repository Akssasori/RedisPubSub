package com.broker.redis.validations.annotations;

import com.broker.redis.validations.Impl.ColorValidatorImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER}) //se ela vai ser usada em class, metodo, parametro e etc...
@Retention(RetentionPolicy.RUNTIME) // pegar em tempo de axecução
@Documented // para a anotação quando for usada em outra classe o texto gerado por javadoc conterá o @ColorValidation texto, como referência a anotação
@Constraint(validatedBy = ColorValidatorImpl.class) // a classe que tera a logica da validação
public @interface ColorValidation {

    //error message
    public String message() default "Invalid color: must be RED, GREEN or BLUE";
    //represents group of constraints
    public Class<?>[] groups() default {};
    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
