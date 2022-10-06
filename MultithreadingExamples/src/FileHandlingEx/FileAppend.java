package FileHandlingEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		String data="We are going to append this file";
		try {
			FileWriter output=new FileWriter("data.txt",true);
			output.write(data);
			System.out.println("File append is successfull");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
