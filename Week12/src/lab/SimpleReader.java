package lab;

import java.io.*;
import java.util.*;

public class SimpleReader {
	
	public static String [] getLines(String fileName) {
        List<String> list = new ArrayList<String>();

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
	        String line = null;
            while((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");  
            return null;
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
            return null;
        }
        return list.toArray(new String[0]);
	}
	
	public static String [] getWords(String line) {
		String [] words = line.split("[ \t,]+");
		return words;
	}
	
	public static int [] getInts(String line) {
		String [] words = getWords(line);
		int [] values = new int[words.length];
		try {
			for(int i=0;i<words.length;i++) {
				values[i] = Integer.parseInt(words[i]);
			}
		} catch(NumberFormatException e) {
			System.out.println("WARNING INVALID INPUT");
			return null;
		}
		return values;
	}
		
	public static double [] getDoubles(String line) {
		String [] words = getWords(line);
		double [] values = new double[words.length];
		try {
			for(int i=0;i<words.length;i++) {
				values[i] = Double.parseDouble(words[i]);
			}
		} catch(NumberFormatException e) {
			System.out.println("WARNING INVALID INPUT");
			return null;
		}
		return values;
	}

}


