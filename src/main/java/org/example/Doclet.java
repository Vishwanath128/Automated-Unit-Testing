package org.example;
import com.sun.javadoc.*;

public class Doclet {

    public static boolean start(RootDoc root) {
        ClassDoc[] classes = root.classes();
        for (ClassDoc cls : classes) {
            System.out.println("Class: " + cls.name());
            MethodDoc[] methods = cls.methods();
            for (MethodDoc method : methods) {
                System.out.println("Method: " + method.name());
                System.out.println("Comment: " + method.commentText());
            }
        }
        return true;
    }

    public static int optionLength(String option) {
        return 2; // Options with arguments
    }
}



