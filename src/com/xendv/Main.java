package com.xendv;

import com.xendv.classes.JavaClass;
import com.xendv.classes.JavaInterface;
import com.xendv.classes.NewJavaClass;

// test classes for demonstration
public class Main {
    public static void main(String[] args) {
        final JavaInterface class1 = new JavaClass();
        final JavaInterface class2 = new NewJavaClass();
        System.out.println(class1.classInfo());
        System.out.println(class2.classInfo());
    }
}
