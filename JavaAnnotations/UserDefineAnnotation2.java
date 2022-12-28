package JavaAnnotations;

import java.lang.annotation.*;

/**
 * Default Annotations which are affect another annotations
 */

/* 
 * @Retention - is also a meta-annotation that comes with some retention policies. These retention policies determine at which point an annotation is discarded.
 */

@Retention(RetentionPolicy.CLASS) // - The annotations annotated using the CLASS retention policy are recorded in the .class file but are discarded during runtime. CLASS is the default retention policy in Java.
// @Retention(RetentionPolicy.RUNTIME) // - The annotations annotated using the RUNTIME retention policy are retained during runtime and can be accessed in our program during runtime.
// @Retention(RetentionPolicy.SOURCE) // - The annotations annotated using the SOURCE retention policy are discarded at runtime.
@interface MyIndicators {
    String name(); // metadata of annotation
    String project();
    String date();
    String version();
    String teamSize() default "6"; // for default value
    // defining annotation with element, it's medetory to give every value on useage of annotation
}

/* 
 * @Documented - annotation to annotate our custom annotations.
 *             - is a meta-annotation (an annotation applied to other annotations) provided in java.lang.annotation package.
 */
@Documented
@interface MyAnno2{

}

/* 
 * @target(value= ) - https://www.geeksforgeeks.org/java-target-annotations/?ref=rp
 *      - to define where to use our own defined annotations
 */
// @Target(value = ElementType.LOCAL_VARIABLE)
// @Target(value = {ElementType.LOCAL_VARIABLE,  ElementType.METHOD}) // - also can give array of elements
@interface MyAnno3{

}

/* 
 * @Inherited - https://www.geeksforgeeks.org/inherited-annotations-in-java/
 *      - is a type of meta-annotation used to annotate custom annotations so that the subclass can inherit those custom annotations.
 */
@Inherited
@interface MyAnno4{

}

/* 
 * @Repeatable - https://www.javatpoint.com/java-8-type-annotations-and-repeating-annotations
 *      - 
 */

@MyIndicators(name = "Annotation", project = "Video Editor", date = "28/12/2022", version = "1.1")
public class UserDefineAnnotation2 {
    
    public static void main(String[] args) {
        
    }
}