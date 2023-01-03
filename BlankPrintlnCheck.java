// Program: Program Linting
import java.util.*;

// This class checks if a line of code calls to print out a 
// empty line to the console, and passes an error if it does. This class also implements
// the Check interface which has a lint method, to read a line of code, and we have to implement
// that method into this class.
public class BlankPrintlnCheck implements Check{

    // This method checks if the line of code it is reading
    // contains the code that prints out an empty line to the console.
    // If it does, it returns an error. If not, it returns an empty Optional
    // which says that there is nothing wrong with the line of code.
    // parameter:
    //      - line: the line of code that is being checked
    //      - lineNumber: the number that the line is at in the file
    public Optional<Error> lint(String line, int lineNumber){
            if (line.contains("System.out.println(\"\")")){
                return Optional.of(new Error(3, lineNumber, "You are printing an empty line!"));
            }
            return Optional.empty();
    }
}