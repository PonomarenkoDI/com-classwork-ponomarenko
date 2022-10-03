package cw03102022.taskAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RepitableAnnotation {
    AnnotationMain[] value();

}
