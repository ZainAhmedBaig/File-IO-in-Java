package practice;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
public class q1 {
	public static void main(String[] args) 
	{
		int x = 0;
		do {
		System.out.println("*******MENU********\n"
				+ "1.Create a File.\n2.Edit a File."
				+ "\n3.Delete a File."
				+ "\n4.Exit Menu");
		Scanner input = new Scanner(System.in);
		System.out.print("Your Choice:");
		 x = input.nextInt();
		if(x == 1)
		{
			createFile();
		}
		else if(x == 2)
		{
			editFile();
		}
		else if(x == 3)
		{
			deleteFile();
		}
		}while(x != 4);
	}
	static void createFile()
	{
		 try {
			 	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			 	
		        System.out.print("Enter the desired name of your file: ");
		        String fileName = input.readLine();
		        fileName = fileName + ".txt";
		        File file = new File(fileName);
		        file.createNewFile();
		        System.out.print("File " +fileName +" Created Successfully.");
			
		} catch (Exception e){e.printStackTrace();}
	}
	static void editFile()
	{
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter the Filename to edit File:");
	        String fileName = input.readLine();
	        fileName = fileName + ".txt";
			File file = new File(fileName);
			PrintWriter out = null;
			out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
				out.print("Hello ");
	            out.println("world");
	            out.println(input.readLine());
	            out.println("unaiz     21  3.4");
	            out.println("ahmed     22  3.5");
	            out.println("bajwa       22  3.5");
	            out.println("Ibraheem  22  3.76");
	            out.close();
		}catch(IOException e){	}
	}
	static void deleteFile()
	{
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the FileName to Delete.");
		String file = input.next();
		file = file + ".txt";
		File f = new File(file);
		if(f.delete())
		{
			System.out.println("File " +file +"Deleted Successfully.");
		}
		else
		{
			System.out.println("Deletion Failed");
		}
		}catch(Exception e) {}
	}
	static void tokenizer(){
	       StringTokenizer tokenizer = new StringTokenizer("ali 22 3.15", "");
	       while(tokenizer.hasMoreTokens())
	        {
	            System.out.println(tokenizer.nextToken());
	        }
	    }
}
