package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *	
 * @author NameG
 *
 */

public class Utils {
	
	public static String loadFileAsString(String path) {
		StringBuilder builder = new StringBuilder(); //String builder allows in this case to add characters to a string
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while((line = br.readLine()) != null) //reads as long as it has a line and gives the value over to the line variable
				builder.append(line + "\n"); //Makes a new Lane after a line that got read
			
			
			br.close();	//closes the buffered reader (gives the ressources back to the system)
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return builder.toString();
	}
	
	/*
	 * Converst Strings to numbers
	 */
	public static int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		}catch(NumberFormatException e){
			e.printStackTrace();
			return 0;
			
		}
	}
}
