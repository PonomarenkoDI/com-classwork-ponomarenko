package cw03102022.taskAnnotation;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepitableAnnotation.class)
public @interface AnnotationMain {
    String value();

}
