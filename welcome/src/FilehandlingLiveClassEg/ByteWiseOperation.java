package FilehandlingLiveClassEg;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ByteWiseOperation {
	public static void main(String[] args) {
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ch;
		System.out.println("ENTER THE DATA: ");
		try {
			while((ch=dis.read())!='@') {
				fos.write(ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data stored Successfully");
	}

}
