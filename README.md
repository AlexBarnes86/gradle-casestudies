Case Studies With Gradle
========================

generate
--------
Code is compiled in phases.
First phase requires compiling the main generator code.
The generator is then run with JavaExec to create more code (immagine a larger scope project with velocity/freemarker/etc).
The generated code is the compiled and archvied excluding the original main source (not necessary, but good for the sake of demonstration).
