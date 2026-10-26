# Run Java-Full-Chapter in VS Code

This repository contains independent lecture examples, not one Java application. Some lectures may reuse class and package names. Keep the lecture hierarchy and compile/run the example you are studying.

## Requirements
- JDK 21
- Visual Studio Code
- The extensions recommended in `.vscode/extensions.json`

Verify Java in the integrated terminal:

```bash
java -version
javac -version
```

## Open the repository as one folder

```bash
git clone https://github.com/amitweb2012/Java-Full-Chapter.git
cd Java-Full-Chapter
code .
```

Or choose **File → Open Folder…** and select the repository root `Java-Full-Chapter`. Do not open only a Java file or a nested lecture folder as the workspace.

## Run one lecture example

From the repository root, for example:

```bash
mkdir -p out
javac -d out "Lecture 19/code/lecture19/Demo2.java"
java -cp out lecture19.Demo2
```

Use the path and class name for the example you want. The fully qualified run name is based on the source file's `package` declaration. For a file without a package declaration, run the class name without a package prefix. You can also use the **Run** link above `main` when VS Code recognizes the file.

## Why this isn't one conventional Maven source tree

The root `pom.xml` uses `packaging=pom`, describing parent/metadata rather than a single app source tree. It does not automatically include each lecture folder as a Maven source folder. Combining all lecture sources can also cause duplicate-class errors if examples reuse names.

Keep the lecture folders and compile one example at a time. Separate Maven modules can be added later if a formal build per lecture is desired.

## Troubleshooting

1. Open the Command Palette with `Cmd+Shift+P`.
2. Run **Java: Configure Java Runtime** and select JDK 21.
3. Run **Developer: Reload Window**.
4. Inspect **View → Output → Language Support for Java** for workspace import errors.
5. Try the terminal compile command above. If it succeeds, Java itself works and the remaining issue is likely VS Code workspace configuration.

## Root Maven check

```bash
mvn -B verify
```

This validates root Maven metadata; it does not compile every independent lecture example by itself.
