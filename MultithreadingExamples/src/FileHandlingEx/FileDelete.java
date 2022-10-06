package FileHandlingEx;

import java.io.File;

public class FileDelete {
	public static void main(String[] args) {
		File myFile=new File("data1.txt");
		if(myFile.delete())
		{
			System.out.println("File deleted "+myFile.getName()+"successfully");
		}
		else
		{
			System.out.println("File deletion failed");
		}
	}

}
