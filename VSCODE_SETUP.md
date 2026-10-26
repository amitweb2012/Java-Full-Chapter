# Run Java-Full-Chapter in Visual Studio Code

This repository is a collection of **independent lecture examples**, not one application.
Some lectures reuse class names, and examples may have different package declarations.
Keep the repository open as the single workspace folder, then run the example you are studying.

## 1. Requirements

- JDK 21
- Visual Studio Code
- VS Code extensions: Extension Pack for Java (or the recommended extensions in this folder)

Verify the JDK in the VS Code terminal:

```bash
java -version
javac -version
```

Both commands should report Java 21.

On macOS, if Java 21 is installed but not selected, check available JDKs:

```bash
/usr/libexec/java_home -V
```

## 2. Open the correct folder

From a terminal:

```bash
git clone https://github.com/amitweb2012/Java-Full-Chapter.git
cd Java-Full-Chapter
code .
```

In VS Code, use **File → Open Folder…** and select the repository's `Java-Full-Chapter` root.
Do not open an individual `.java` file as the workspace and do not open a parent folder that contains multiple copies of the repository.

## 3. Run a lecture example

Open a source file such as:

`Lecture 19/code/lecture19/Demo2.java`

Use the **Run** link above its `main` method if the Java extension recognizes it.

The terminal approach is dependable even when VS Code's Java project explorer groups the independent examples incorrectly. From the repository root, run:

```bash
mkdir -p out
javac -d out "Lecture 19/code/lecture19/Demo2.java"
java -cp out lecture19.Demo2
```

Use the class name that matches the file and package. For example, if the source starts with `package lecture19;` and contains `class Demo2`, the run command is `java -cp out lecture19.Demo2`.

For a source file with **no package declaration**, compile and run it like this:

```bash
javac -d out "path/to/Example.java"
java -cp out Example
```

Replace the paths and class names with those of the example you are learning.

## 4. Why one giant Java source root is not ideal

Each lecture is a separate learning example. Turning every lecture directory into one shared source root can cause duplicate-class errors when multiple files use the same class name or package. The root `pom.xml` is a Maven parent/metadata project (`packaging=pom`); it does not automatically turn every lecture folder into a Maven source set.

Keep the original folder hierarchy. Compile one example at a time, or use each lecture's own build configuration if one is added in the future.

## 5. If VS Code still does not recognize Java

1. Open the Command Palette (`Cmd+Shift+P`).
2. Run **Java: Configure Java Runtime** and select JDK 21.
3. Run **Developer: Reload Window**.
4. Check **View → Output → Language Support for Java** for the actual import/build error.
5. Try the terminal compile command above. If it works, the JDK and source are usable; remaining issues are likely workspace/import configuration.

## 6. Build metadata check

From the repository root:

```bash
mvn -B verify
```

This validates the root Maven project metadata; it does not compile all lecture examples by itself. See the GitHub Actions workflow for the separate isolated-example compile check.
