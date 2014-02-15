
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class ReadWriteFiles {
    
public static void main(String[] args) throws FileNotFoundException, IOException{
    new ReadWriteFiles().start();
}

public void start() throws FileNotFoundException, IOException{
    System.out.println("Please enter the file you want TO COPY.");
        Scanner input = new Scanner(System.in);
        String fileToCopy = input.nextLine();
        
        System.out.println("Please enter the file you want TO COPY TO.");
        Scanner input2 = new Scanner(System.in);
        String targetFile = input2.nextLine();
        
        File existingDir = new File("/Users/Esha/Desktop/hi/"+ fileToCopy);
        File toBeDir = new File("/Users/Esha/Desktop/hi/"+ targetFile);
       // if (existingDir.exists()){
        File[] arrayDirectory = existingDir.listFiles();
//        for (int i = 0;i<arrayDirectory.length; i++){
//            System.out.println("Copying File: "+ arrayDirectory[i]);
       int i = 0;
            copyFileContents(existingDir, toBeDir);
        }
//}

public void copyFileContents (File existingDir, File toBeDir) throws FileNotFoundException, IOException{
    FileReader fileRead = new FileReader(existingDir);
    BufferedReader BufferRead = new BufferedReader(fileRead);//Reads the file
    
    FileWriter fileWrite = new FileWriter(toBeDir);
    BufferedWriter BufferWrite = new BufferedWriter(fileWrite);//writes the file
    
    String line ;
    while((line = BufferRead.readLine())!= null){
        System.out.println(line);
        BufferWrite.write(line);
        BufferWrite.newLine();
    }
    BufferRead.close();
    BufferWrite.close();
}

}
