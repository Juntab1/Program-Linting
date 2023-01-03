// Program: Program Linting

// This class is used to output to the user their line of 
// code that contains  the error. 
// We output what the line number of the code is, error number of that code,
// and the message of the error code.
public class Error {
	private int code;
	private int lineNumber;
	private String message;

	// This constructor creates the code, lineNumber, and message
	// variables for this Error class given the parameters of this
	// constructor.
    // parameter:
    //      - code: the number of the error code
    //      - lineNumber: the number that the line is at in the file
	//		- message: message of that error code explaining what the problem is
	public Error(int code, int lineNumber, String message) {
		this.code = code;
		this.lineNumber = lineNumber;
		this.message = message;
	}

	// This method returns the variables of this class
	// in a string form to the console.
	public String toString() {
		return ("(Line: " + lineNumber + ") has error code " + code + "\n" + message);
	}

	// This method returns the line number of the error code.
	public int getLineNumber() {
		return lineNumber;
	}

	// This method returns the number associated with the specific error found in the code.
	public int getCode() {
		return code;
	}

	// This method returns the message of the error number.
	public String getMessage() {
		return message;
	}

}