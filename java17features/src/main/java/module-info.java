module java17features {
    exports org.demo.j17;
}
//comment
/**javac -d target/classes src/main/java/module-info.java src/main/java/org/demo/j17/*.java
 * running individual-
 * java --module-path target/classes --module java17features/org.demo.j17.SwitchExpressionDemo
 * java --module-path target/classes --module java17features/org.demo.j17.PatternMatchingInstanceofDemo     
 * 
 */