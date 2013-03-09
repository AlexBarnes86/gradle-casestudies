package com.toastedbits.gradletest.generator;

import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Generator {
	public static void main(String[] args) throws IOException {
		new File("src/generated/java/com/toastedbits/gradletest/generated").mkdirs();
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/generated/java/com/toastedbits/gradletest/generated/Generated.java")));
		pw.println("package com.toastedbits.gradletest.generated;");
		pw.println();
		pw.println("public class Generated {");
		pw.println("\tpublic static void main(String[] args) {");
		pw.println("\t\tSystem.out.println(\"Hello, World\");");
		pw.println("\t}");
		pw.println("}");
		pw.close();
	}
}
