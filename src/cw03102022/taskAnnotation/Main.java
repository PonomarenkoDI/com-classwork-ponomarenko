package cw03102022.taskAnnotation;

import java.lang.annotation.Annotation;

@AnnotationMain("Hello")
@AnnotationMain("World")
@AnnotationMain("!")
@NotRepitableAnnotation(100)
public class Main {


    public static void main(String[] args) {
        showMethod();
        System.out.println(returnMethod());
    }

    public static void showMethod() {
        Main main = new Main();
        try {
            Annotation[] arr = main.getClass().getAnnotations();
            for (Annotation ann : arr) {
                System.out.println(ann);
            }
        } catch (Exception e) {

        }

    }

    public static boolean returnMethod() {
        return Main.class.isAnnotationPresent(NotRepitableAnnotation.class);

    }
}


