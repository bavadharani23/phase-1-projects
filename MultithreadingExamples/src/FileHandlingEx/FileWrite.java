package FileHandlingEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
		String data="101, Anu K, Dindigul,Tamilnadu, India.";
		try {
			FileWriter output = new FileWriter("data.txt");
			output.write(data);
			System.out.println("Data is written into the File successfully ");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
