/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.lang.Object;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class DuplicateAFile {
    
    public static void main(String[] args) throws IOException{
        System.out.println("Please enter the file you want TO COPY.");
        Scanner input = new Scanner(System.in);
        String fileToCopy = input.nextLine();
        
        System.out.println("Please enter the file you want TO COPY TO.");
        Scanner input2 = new Scanner(System.in);
        String targetFile = input2.nextLine();
        
        
        
        //make a pointer to existing file:
        File existingDir = new File("/Users/Esha/Desktop/"+ fileToCopy);
        File[] arrayDirectory = existingDir.listFiles();//list the files in directory to copy
        System.out.println(existingDir);
        
        Path source = Paths.get("/Users/Esha/Desktop/"+ fileToCopy+ "//");
        Path target = Paths.get("/Users/Esha/Desktop/"+ targetFile+ "//");
        
        //creates a blank output stream
        //FileOutputStream outStream = new FileOutputStream("/Users/Esha/Desktop/"+ targetFile);
        
        File[] targetArray = (new File("/Users/Esha/Desktop/"+ existingDir)).listFiles();
        
        System.out.println(source);
        System.out.println(target);
        
        if(arrayDirectory.length !=0){
        for (File temp:arrayDirectory){
            System.out.println("Copying: " + temp.getName());
            }
        }
        if (Files.exists(source)){
            //if (Files.exists(target)){
            System.out.println("Would you like to replace existing file, or don't save?"
                    + "\nPress 1 for REPLACE\nPress 2 for DONT SAVE ");
            Scanner input3 = new Scanner(System.in);
            String choices = input3.nextLine();
            int choice = Integer.parseInt(choices);
            
            System.out.println(choice);
            switch(choice){
                
                case 1: //user wants to copy
                        File[] existingDirFiles = existingDir.listFiles();
                        for (int i = 0; i<=existingDirFiles.length-1;i++){
                            
                            File fileName = new File( existingDirFiles[i].toString());
                            System.out.println(fileName);
                            FileInputStream instream = new FileInputStream(fileName);
                            System.out.println("Now working on: " + fileName );
                            Properties config = new Properties();
                            config.load(instream);
//                            File fileNameTo = new File( targetArray[i].toString());
  //                          FileOutputStream outstream = new FileOutputStream(fileNameTo);
    //                        config.store(outstream, "");
                            instream.close();
                            
                            Path fileToAdd = fileName.toPath();
                            Path sourceThis =Paths.get(fileToCopy +fileToAdd);
                        Files.copy(sourceThis, target, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Replaced");
                        }
                break; 
                case 2: //user wats to replace
                        System.out.println("Did not save");
                break;
                default: System.out.println("Function Terminated. Please repeat procedure and press 1 or 2.");
            }}
        
         /*else if (!Files.exists(target)){
            File[] existingDirFiles = existingDir.listFiles();
                        for (int i = 0; i<=existingDirFiles.length-1;i++){
                            
                            File fileName = existingDirFiles[i];
                            Path fileToAdd = fileName.toPath();
                            Path sourceThis =Paths.get("/Users/Esha/Desktop/CV"+ fileToCopy +fileToAdd);
                        Files.copy(sourceThis, target, StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("Copying attributes");
        }}*/

        else System.out.println("Source does not exist");
    
}}
    


