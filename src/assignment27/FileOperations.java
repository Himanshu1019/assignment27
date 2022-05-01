package assignment27;

import java.io.File;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 
			      File file = new File("C:/hima.txt");
			      System.out.println(file.exists());
			      
			      File file1
		            = new File("C:\\Users\\Mayank\\Desktop\\1.txt");
		 
		        if (file1.delete()) {
		            System.out.println("File deleted successfully");
		        }
		        else {
		            System.out.println("Failed to delete the file");
		        }
		        
		        System.out.println("Enter the path to create a directory: ");
		        Scanner sc = new Scanner(System.in);
		        String path = sc.next();
		        System.out.println("Enter the name of the desired a directory: ");
		        path = path+sc.next();
		        //Creating a File object
		        File myfile = new File(path);
		        //Creating the directory
		        boolean bool = file.mkdir();
		        if(bool){
		           System.out.println("Directory created successfully");
		        }else{
		           System.out.println("Sorry couldn’t create specified directory");
		        }
			   }
			}

	


