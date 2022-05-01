package assignment27;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EmpSalary
{

	public static void main(String[] args)
	{
		
	
	File myfile=new File("hima.txt");
	try
	{
		myfile.createNewFile();
		
	}

catch(Exception e)
	{
	System.out.println("sorry! can't create a file");
	e.printStackTrace();
	}
try 
{
	FileWriter fw=new FileWriter("hima.txt");
	Scanner s=new Scanner(myfile);
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the no of employee");
	 System.out.println("please enter sunny salary");
	 while (sc.hasNextLine())
	 {
		 
         int a = sc.nextInt();
         System.out.println("please enter sadhna salary");
         int b = sc.nextInt();
         System.out.println("please enter hima salary");
         int c = sc.nextInt();
         System.out.println("please enter nikhil salary");
         int d = sc.nextInt();
         System.out.println("sunny salary ="+a);
         System.out.println("sadhna salary ="+b);
         System.out.println("hima salary ="+c);
         System.out.println("nikhil salary ="+d);
	 }
	 
	fw.write("i");
	fw.close();
}
catch(Exception e)
{
	e.printStackTrace();
	
}
try 
{
	Scanner sc=new Scanner(myfile);
	while(sc.hasNextLine())
	{
		String line=sc.nextLine();
		System.out.println(line);
	}
	sc.close();
}catch(Exception e)
{
	e.printStackTrace();
	
}


	}
}

