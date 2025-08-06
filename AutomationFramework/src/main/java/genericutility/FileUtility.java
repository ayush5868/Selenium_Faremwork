package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author AYUSH KUMAR
 */

public class FileUtility {
	/**
	 * This method will read data from property file and return value to the caller
	 * @parameter key
	 * @return value
	 * @throws IOException
	
	*/
	public String getdatafromproperty(String key) throws IOException {
		FileInputStream fis   = new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		Properties prop  =new Properties();
		prop.load(fis);
		return prop.getProperty(key);
			
	}

}
