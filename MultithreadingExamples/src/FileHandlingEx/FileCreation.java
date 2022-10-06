package FileHandlingEx;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		File myFile=new File("data.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("File created successfully");
				
			}
			else
			{
				System.out.println("File creation error");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
