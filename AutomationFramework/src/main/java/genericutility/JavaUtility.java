package genericutility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author AYUSH KUMAR
 */

public class JavaUtility {
	/**This method will return current system date and time in string format
	 * 
	 * @return String
	 */
	
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This method will generate the random number
	 * @return int
	 */
	
	public int getRandomNumber() {
		Random ran = new Random();
		return ran.nextInt(1000);
	}

}
