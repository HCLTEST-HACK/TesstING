package restutills;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateData {
	
	public static String getDescription() throws Exception{
		
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return (ReadData_Property.getproper("description") + generatedString);
	}

	

	public static String getUserName(){
		
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return ("SELVI" + generatedString);
		}

		public static String getPassword() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return ("SELVI" + generatedString);
		}

		public static String getEmail() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return (generatedString + "@gamil.com");
		}

		public static String empName() {
			String generatedString = RandomStringUtils.randomAlphabetic(1);
			return ("SELVI" + generatedString);
		}

		public static String empSal() {
			String generatedString = RandomStringUtils.randomNumeric(5);
			return (generatedString);
		}

		public static String empAge() {
			String generatedString = RandomStringUtils.randomNumeric(2);
			return (generatedString);
		}
	

}
