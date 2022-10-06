package FileHandlingEx;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of char: ");
		size=sc.nextInt();
		char data[]=new char[size];
		try {
			FileReader input=new FileReader("data.txt");
			input.read(data);
			System.out.println("Data is received from the file");
			System.out.println(data);
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
