package in.gopocket.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

	public String getData_PropertyFile(String key) throws IOException {

		FileInputStream file = new FileInputStream("./Data/CommonData.properties");
		Properties pip = new Properties();
		pip.load(file);
		String data = pip.getProperty(key);
		return data;
	}
}
