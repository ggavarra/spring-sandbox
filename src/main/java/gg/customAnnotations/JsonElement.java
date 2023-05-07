package gg.customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/**
 * Field Level Annotation
 */
public @interface JsonElement {
    /**
     * When creating custom annotations with methods, we should be aware that these methods must have no parameters, and cannot throw an exception.
     * Also, the return types are restricted to primitives, String, Class, enums, annotations, and arrays of these types, and the default value cannot be null.
     */
    public String key() default "";
}
