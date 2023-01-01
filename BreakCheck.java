// Name: Jun Bruttomesso
// Date: 12/1/2022
// Class: CSE 122
// TA: Colton Harris
// Program: Program Linting
import java.util.*;

// This class checks if the user uses the break keyword
// in lines of code, not comments. This class also implements
// the Check interface which has a lint method, to read a line of code, and we have to implement
// that method into this class.
public class BreakCheck implements Check {
    
    // This method checks if the break keyword is used without a comment in that line
    // and also checks if the break keyword is used before a comment in a line of code.
    // If it does, it returns an error. If not, it returns an empty Optional
    // which says that there is nothing wrong with the line of code.
    // parameter:
    //      - line: the line of code that is being checked
    //      - lineNumber: the number that the line is at in the file
    public Optional<Error> lint(String line, int lineNumber){
        if (!line.contains("//")){
            if (line.contains("break")){
                return Optional.of(new Error(2, lineNumber, "Can't use 'break' in code!"));
            }
        }
        else if(line.contains("//") && line.contains("break")){
            if (line.indexOf("//") > line.indexOf("break")){
                return Optional.of(new Error(2, lineNumber, "Can't use 'break' in code!"));
            }   
        }
        return Optional.empty();
    }
}