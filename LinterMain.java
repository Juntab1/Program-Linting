// Program: Program Linting
import java.util.*;
import java.io.*;

// This class actually prints out to the console the errors found one by one.
public class LinterMain {
    public static final String FILE_NAME = "TestFile.java";

    public static void main(String[] args) throws FileNotFoundException {
        List<Check> checks = new ArrayList<>();
        checks.add(new LongLineCheck());
        checks.add(new BlankPrintlnCheck());
        checks.add(new BreakCheck());
        Linter linter = new Linter(checks);
        List<Error> errors = linter.lint(FILE_NAME);
        for (Error e : errors) {
            System.out.println(e);
        }
    }
}