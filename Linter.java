// Name: Jun Bruttomesso
// Date: 12/1/2022
// Class: CSE 122
// TA: Colton Harris
// Program: Program Linting
import java.util.*;
import java.io.*;

// This class runs though each line of code from a file 
// and puts it against the checks like BreakCheck, BlankPrintlnCheck, and LongLineCheck
// to see if the line of code does or does not pass the checks.
public class Linter {
    private List<Check> checks;

    // This constructor lets us use the list of checks, in this specific class.
    // parameter:
    //      - checks: gives us access to the list of checks in another file that 
    // creates and contains the check methods in a list
    public Linter(List<Check> checks) {
        this.checks = checks;
    }

    // This instance method finds if any of the lines of code from the passed in
    // file does not pass the checks. After going through the whole file of code,
    // a list of all the errors are returned to the user.
    // parameter:
    //      - fileName: gives us the name of the file to read from
    // the FileNotFoundException is for when the user inputs a file name that can't be found. 
    public List<Error> lint(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<Error> allErrors = new ArrayList<>();
        int lineNumber = 1;
        while (input.hasNextLine()){
            String line = input.nextLine();
            for (int i = 0; i < checks.size(); i++){
                Check currentCheck = checks.get(i);
                Optional<Error> currentError = currentCheck.lint(line,lineNumber);
                if (currentError.isPresent()){
                    allErrors.add(currentError.get());
                }
            }
            lineNumber++;
        }
        return allErrors;
    }
}