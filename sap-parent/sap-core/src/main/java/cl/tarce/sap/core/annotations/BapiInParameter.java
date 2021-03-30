package cl.tarce.sap.core.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author tarce
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface BapiInParameter {
	String name() default "";
	ParameterType type() default ParameterType.SCALAR;
	Class mappingClass() default Object.class;
}
