
/**
 * @class InvalidTypeException
 * @author chahat
 * @created 09-04-2021
 * @updated by chahat
 * @description InvalidTypeException is a custom exception class which is raised 
 * when user enters the type of item other than raw, manufactured and imported.
 */

package business;


public class InvalidTypeException extends RuntimeException {
	public InvalidTypeException(String msg) {
		super(msg);
	}
	

}
