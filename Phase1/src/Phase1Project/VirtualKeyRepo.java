package Phase1Project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKeyRepo {
	Scanner scanner = new Scanner(System.in);
	File folder_name;
	static String DIRECTORY;
	    public VirtualKeyRepo() {
	        DIRECTORY = System.getProperty("user.dir");// this is used to get the current working directory
	        folder_name = new File(DIRECTORY+"/files"); // "/files" is used to add the file which you create inside files folder in phase1project module orelse the files will be created but not inside the files folder.
	    }
	     static String MAIN_MENU =
	            "\nMAIN MENU - Choose one of the following: \n"+
	                    "1 -> List files in directory\n"+
	                    "2 -> Add, Delete or Search\n"+
	                    "3 -> Exit Program";
	    static String SECOND_MENU =
	            "   \nChoose any of the following: \n"+
	                    "   a -> Add a file\n"+
	                    "   b -> Delete a file\n"+
	                    "   c -> Search a file\n"+
	                    "   d -> Return back to main menu";
	    void showFirstMenu() {
	    	 System.out.println(MAIN_MENU);
            int option = scanner.nextInt();
            switch (option){
                case 1 : {
                    listFiles();
                    showFirstMenu();
                }
                case 2 : {
                    showSecondMenu();
                }
                case 3 : {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default: showFirstMenu();
            }
            System.out.println("Please enter 1, 2 or 3");
	    }
	    void showSecondMenu() {
	    	System.out.println(SECOND_MENU);
	    	try
	    	{
	    		Scanner scanner = new Scanner(System.in);
		        char[] input = scanner.nextLine().toCharArray();
	            char option = input[0];

	            switch (option){
	                case 'a' : {
	                    System.out.println("Adding a file...Please Enter a File Name : ");
	                    String fileName = scanner.nextLine();
							CreateFile(fileName);
	                    break;
	                }
	                case 'b' : {
	                    System.out.println("Deleting a file...Please Enter a File Name : ");
	                    String filename = scanner.next();
	                    deleteFile(filename);
	                    break;
	                }
	                case 'c' : {
	                    System.out.println(" Searching a file...Please Enter a File Name : ");
	                    String filename = scanner.next();
	                    searchFile(filename);
	                    break;
	                }
	                case 'd' : {
	                    System.out.println("Going Back to MAIN menu");
	                    showFirstMenu();
	                    break;
	                }
	                default : System.out.println("Please enter a, b, c or d");
	            }
	        
            showSecondMenu();
	    	}
	    	catch (Exception e){
	            System.out.println("Please choose any of the following a, b, c or d");
	            showSecondMenu();
	            
	        }
        }
 
    void listFiles()
    {
    	if (folder_name.list().length==0)
            System.out.println("The folder is empty");
        else {
            String[] str = folder_name.list();
            System.out.println("The files in "+ folder_name +" are :");
            Arrays.sort(str);
            for (String display:str) {
                System.out.println(display);
            }
        }
    	
    }
	
	void CreateFile(String fileName) throws IOException
	{
        File sourceFile = new File(folder_name+"/"+fileName);// "/" is used to create a file in files folder. If you use like this "/files" then it will created like filesjava but the file name you gave would be only java.
        if(sourceFile.exists())
        {
        	System.out.println("File is already present");
        }
        if(sourceFile.createNewFile())
        {
        	System.out.println("File "+fileName+" added successfully"+folder_name);
        }
        else
        {
        	System.out.println("File "+fileName+" not added ");
        }
        
	}
	void deleteFile(String fileName)
	{
        File sourceFile = new File(folder_name+"/"+fileName);
        String[] str = folder_name.list();
        for (String file: str) {
            if (fileName.equals(file) && sourceFile.delete()) {
                System.out.println("File " + fileName + " deleted from " + folder_name);
                return; // we have give return or else the file not found print statement will also execute.
            }
        }
        System.out.println("File " + fileName + " is not found");
		
	}
	void searchFile(String fileName)
	{
        String[] str = folder_name.list();
        for (String file: str) {
            if (fileName.contains(file)) {
                System.out.println("FOUND : File " + fileName + " exists at " + folder_name);
                return;
            }
        }
        System.out.println("File NOT found (FNF)");
    }
	

}
