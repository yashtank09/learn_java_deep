package JavaAnnotations;

/** 
 * User Define Annotation
 *  - Java annotations are a mechanism for adding metadata information to our source code (Program). 
 *      
 *      - Syntax -
 *      @interface MyAnnotation {
 *      }
 * 
 * We can use these annotations at:
 *  - Class Level Annotation
 *  - Field Level Annotation
 *  - Method Level Annotation
 * 
 */

// import java.lang.annotation.Annotation;

// by adding '@' to inteface defination it will became an annotation
@interface MyAnno {
    String name(); // metadata of annotation
    String project();
    String date();
    String version();
    String teamSize() default "6"; // for default value
    // defining annotation with element, it's medetory to give every value on useage of annotation
}

@MyAnno(name = "Ajay", project = "Annotation Example", date = "28/12/2022", version = "1.0")
public class UserDefineAnnotation {
    
    // @MyAnno - Method level
    public static void main(String[] args) { // also can give at parameter level
        // @MyAnno - Field level
        int x = 0;
        System.out.println(x);
    }

}
