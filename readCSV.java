/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */

    
import java.io.*;
import java.util.Scanner;

public class readCSV 
{
	public static void main(String[] args)
	{
		new readCSV().start();
	
	}
	
	public void start()
	{
		System.out.print("Please provide the file name to search: ");
                Scanner input = new Scanner(System.in);
                String str = input.nextLine();
		
		//assumed the folder name is already provided
		File dir = new File("/Users/Esha/Desktop/num");
		
		if (dir.exists())
		{
			System.out.println("Directory Found");
			//check the file now exist in that directory
			String[] directoryConts = dir.list();
			
			for (int i = 0; i < directoryConts.length; i++)
			{
				System.out.println("File found: " + directoryConts[i]);
			
				if (str.toLowerCase().equals(directoryConts[i].toLowerCase()))
				{
					System.out.println(str + " found");
					printContents(str);
					break; // save iterating anymore
				}
			}
		
		}
		else{
				System.out.println("Folder/directory does not exist");
			}

	}
	
	public void printContents(String fileName)
	{
	//bufferedReader must be called from within try/catch statement - to catch any IOException
		try {				
				FileReader file = new FileReader(fileName);
				//buffered reader to read the file
				BufferedReader buffer = new BufferedReader(file);
				//blank line that will provide itself as the out put from the line found in 
				String line = "";
				while ( (line = buffer.readLine()) != null)
				{
					System.out.println(line);	
					int total = totals(line);	
					int ave = averageTotals(line);	
					
					System.out.println("TOTAL: " + total + " Average: " + ave);
				}
				//must close this once complete
				buffer.close();
				
			}
			catch(IOException e)
			{
				System.out.println("An error has occurred");		
			
			}	
	
	}


	public int totals(String lineInts)
	{
		int total = 0;
		int start = 0;
		int lineLength = lineInts.length();
				
		for (int i = 0; i < lineLength; i++)
		{
			if (lineInts.charAt(i) == ',')
			{					
				String num = lineInts.substring(start, i);
				num = num.trim(); //trims space around string
				total = total + Integer.parseInt(num); //change string number to int number
				start = i+1; //make the next starting point the last i position in the iteration				
			}
		
		}
		
		return total;	
	}
	
	
	public int averageTotals(String lineInts)
	{
		int total = 0;
		int start = 0;
		int count = 0;
		int lineLength = lineInts.length();
				
		for (int i = 0; i < lineLength; i++)
		{
			if (lineInts.charAt(i) == ',')
			{					
				String num = lineInts.substring(start, i);
				num = num.trim(); //trims space around string
				total = total + Integer.parseInt(num); //change string number to int number
				start = i+1; //make the next starting point the last i position in the iteration	
				count = count + 1;
			}
		
		}
		
		return total/count;	
	}

}
    

