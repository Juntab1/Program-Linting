// Name: Jun Bruttomesso
// Date: 12/1/2022
// Class: CSE 122
// TA: Colton Harris
// Program: Program Linting
import java.util.*;

// This class checks if a line of code is 100 characters or greater. This class also implements
// the Check interface which has a lint method, to read a line of code, and we have to implement
// that method into this class.
public class LongLineCheck implements Check{

    // This method checks if the line of code is 100 characters or greater.
    // If it is, it returns an error. If not, it returns an empty Optional
    // which says that there is nothing wrong with the line of code.
    // parameter:
    //      - line: the line of code that is being checked
    //      - lineNumber: the number that the line is at in the file
    public Optional<Error> lint(String line, int lineNumber){
        if (line.length() >= 100){
            return Optional.of(new Error(1, lineNumber, "Line of code is over 100 characters!"));
        }
        return Optional.empty();
    }
}