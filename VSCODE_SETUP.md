# Run Java-Full-Chapter as one VS Code workspace

The repository is configured as one VS Code workspace containing independent Java lecture examples. Open the repository root once, then use the Java **Run** / **Debug** CodeLens above any class that has a `main` method.

## Requirements

- JDK 21
- Visual Studio Code
- The recommended extensions in `.vscode/extensions.json`

Verify the JDK from the VS Code terminal:

```bash
java -version
javac -version
mvn -version
```

All three should use JDK 21.

## Open the project

```bash
git clone https://github.com/amitweb2012/Java-Full-Chapter.git
cd Java-Full-Chapter
code .
```

Use **File → Open Folder…** and select the top-level `Java-Full-Chapter` folder. Do not open a single `.java` file or a nested lecture folder as the workspace.

## Run any example

1. Wait for the Java language server to finish loading.
2. Open any lecture `.java` file that has `public static void main(String[] args)`.
3. Click **Run** or **Debug** above the `main` method.

The workspace settings list each existing lecture `code` directory as a Java source root. Maven import is disabled for this workspace because the root `pom.xml` is metadata-only (`packaging=pom`), not a conventional application source tree. This lets the Java extension treat the lecture source directories as one unmanaged Java project.

Examples are still independent. Run one main class at a time; don't assume all examples are one application or that every file has a `main` method. If different lectures have classes with the same package and class name, those would conflict in a shared project; the current lecture packages are intended to keep examples separated.

## If Run / Debug is missing

1. Install/enable the recommended Java extensions.
2. Press `Cmd+Shift+P` and run **Java: Configure Java Runtime**; select JDK 21.
3. Run **Java: Clean Java Language Server Workspace**, confirm, and let VS Code restart.
4. Run **Developer: Reload Window**.
5. Open **View → Output → Language Support for Java** and check for import errors.

## Terminal fallback

From the repository root, compile and run a packaged class individually:

```bash
mkdir -p out
javac -d out "Lecture 19/code/lecture19/Demo2.java"
java -cp out lecture19.Demo2
```

Change the source path and fully qualified class name for the example you are studying.

## Maven note

`mvn -B verify` checks the root POM metadata only. It does not compile every lecture example; use the Java Run action or the terminal fallback above to run a lesson.
