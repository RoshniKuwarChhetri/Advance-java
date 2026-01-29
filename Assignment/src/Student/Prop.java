package Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("app.properties");//*opens app.properties file*////file not found //if use putting outside src use fylly qualified name if under src just remove src
			Properties p=new Properties();//*creates aproperty object to store key value pair			
			p.load(f);//*loades data into object*from property file////ioexception
			//System.out.println(p);
			String url=p.getProperty("url");//*retrive the value*//
			System.out.println(url);//*display the valur*//
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
	
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
