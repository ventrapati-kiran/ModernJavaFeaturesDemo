module java21features {
    exports org.demo.j21;
}
/**
 * javac -d out --module-source-path src src/java21features/module-info.java src/java21features/org/demo/j21/MyClass.java
 * Explanation:

-d out: Specifies the output directory for compiled classes.
--module-source-path src: Points to the root directory containing the module folders.
src/java21features/module-info.java: Path to the module-info.java file.
MyClass.java: Path to the Java class file.
java --module-path out --module java21features/org.demo.j21.MyClass
 */