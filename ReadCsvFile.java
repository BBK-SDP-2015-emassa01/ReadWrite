/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class ReadCsvFile {
    
    public static void main(String[] arga) throws FileNotFoundException, IOException{
        new ReadCsvFile().start();
    }
    public void start() throws FileNotFoundException, IOException{
        System.out.print("Please provide the file name to search: ");
	Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        String location = "/Users/Esha/Desktop/num/";
        
        
        File folder = new File(location);
        
        
        if (folder.exists()){
            System.out.println("Found folder");
            
            String[] folderFiles= folder.list();
            
            
//            for (File folderFile : folderFiles) {
            for (int i = 0; i < folderFiles.length;i++) {
                System.out.println("Found:" + folderFiles[i]);
                if ((str.equals(folderFiles[i]))) {
                  //  if (str.equals(folderFiles[i]))
				//{
					System.out.println(str + " found");
					printContents(str);
                                        writeLine("this text.csv", "adding this text");
					//break; // save iterating anymore
                                        printContents(str);
            }
        }
    }
    }
				//}
                //} else {
                  // System.out.println("oops");
                //}
            //}
        //}
    //}
    
    public void writeLine(String filename, String text) throws IOException{
        FileWriter write = new FileWriter(filename);
        BufferedWriter bufferWriter = new BufferedWriter(write);
        write.append(text);
        bufferWriter.close();
    }
            
            public void printContents(String filename) throws FileNotFoundException{
                
                    FileReader file = new FileReader(filename);
                    //buffered reader to read file
                    BufferedReader buffer = new BufferedReader(file);
                    //the blank like provides an escapt for the != null part
                    String line = "";
                    try{
                    while((line=buffer.readLine())!=null){
                        System.out.println(line);
                        int total = totals(line);
                        //int average = average(line);
                        //System.out.println("TOTAL: " + total + " Average: " + average);
                        
                    }System.out.println("\n");
                    buffer.close();
                    
                }catch (IOException e){
                    System.out.println("Something weird happened.");
                }
            }
            
            public int totals(String line){
                
                int total = 0;
                int start = 0;
                int linelength = line.length();
                try{
                for (int i = 0; i <linelength; i++){
                    if (line.charAt(i) == ','){
                        //if(start<=line.length()-2);
                        String numbers = line.substring(start, i).trim();
                        int value = Integer.parseInt(numbers);
                        total = total+value;
                        start = start+1;
                    }
                } 
                }catch (Exception e){
                    e.printStackTrace();
                }return total;
            }
            
            public int average(String line){
                int total = 0;
                int average = 0;
                int count = 0;
                int start = 0;
               int linelength = line.length();
             for (int i= 0; i<linelength; i++){
                 if (line.charAt(i) == ','){
                     String numbers = line.substring(start, i).trim();
                     int value = Integer.parseInt(numbers);
                     total = total+ value;
                     start = start+1;
                     count = count+1;
                 }
             } 
             average = total/count;  
             return average;
            }
 }

    
