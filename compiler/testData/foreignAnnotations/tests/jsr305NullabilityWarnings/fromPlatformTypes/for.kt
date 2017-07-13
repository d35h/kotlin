// WARNING_FOR_JSR305_ANNOTATIONS

// FILE: J.java

import java.util.*;

public class J {
    @MyNonnull
    public static List<String> staticNN;
    @MyNullable
    public static List<String> staticN;
    public static List<String> staticJ;
}

// FILE: k.kt

fun test() {
    val platformNN = J.staticNN
    val platformN = J.staticN
    val platformJ = J.staticJ

    for (x in platformNN) {}
    for (x in <!NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS!>platformN<!>) {}
    for (x in platformJ) {}
}

