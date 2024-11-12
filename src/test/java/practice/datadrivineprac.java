package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class datadrivineprac {
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("./src/test/resources/practice.properties");
			Properties property=new Properties();
			property.load(fis);
			String Email = property.getProperty("Email");
			System.out.println(Email);
			String Password=property.getProperty("Password");
			System.out.println(Password);
			String LOGIN=property.getProperty("LOGIN");
			System.out.println(LOGIN);
		    String time = property.getProperty("time");
		    System.out.println(time);
			
		}
}

			
		
