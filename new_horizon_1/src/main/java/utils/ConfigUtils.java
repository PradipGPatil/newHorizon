package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
	public static Properties readProperty(String filename) throws IOException {
		
		File file=new File(filename);
		FileInputStream fin=new FileInputStream(file);
		Properties property=new Properties();
		property.load(fin);
		return property;
		
	}

}
