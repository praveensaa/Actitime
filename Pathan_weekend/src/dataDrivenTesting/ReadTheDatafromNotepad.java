package dataDrivenTesting;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTheDatafromNotepad {
	public static void main(String[] args) throws IOException{
	FileInputStream	fis =new FileInputStream("./testdata/Commondata.properties");   
                                     Properties probj =new Properties();
                                   probj.load(fis);
                                  String  Url =probj.getProperty("Url");
                                  System.out.println("Url = "+ Url);
                                  String  Browsername =probj.getProperty("Browsername");
                                  System.out.println("Browsername= "+ Browsername);
                                  String  Username =probj.getProperty("Username");
                                  System.out.println("Username= "+ Username);
                                  
	}

}
