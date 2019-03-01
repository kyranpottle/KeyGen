import java.util.Random;

/**
 * Class to generate a random 32-character key
 * @author Kyran Pottle
 * @version 1.0
 */
public class KeyGen {
	/**
	 * Function to generate key
	 * @return String of random characters to be used as a key
	 */
	public String generateKey() {
		char[] chars = new char[32]; 	// Array to hold generated characters before consolidating to a string
		char thisChar;	// Will be used to hold each character as it is generated
		String finalString;
																					// Populate chars
		for(int i=0; i<chars.length; i++) {
			Random r = new Random();	// Create a new instance of Random for each character
			thisChar = (char) (r.nextInt(93)+33);
			chars[i] = thisChar;
		}																			// Consolidate 
																					// to String
		finalString = "";	// Ensure that the string is empty
		for(int n=0; n<chars.length; n++) {	finalString += chars[n];	}// Append character number n to finalString
		return finalString;
	}
}