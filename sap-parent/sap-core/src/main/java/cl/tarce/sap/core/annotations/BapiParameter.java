package cl.tarce.sap.core.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author tarce
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface BapiParameter {
	String name() default "";
	ParameterType type() default ParameterType.SCALAR;
}
