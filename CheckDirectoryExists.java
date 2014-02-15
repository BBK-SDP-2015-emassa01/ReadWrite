/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;
import java.lang.Exception.*;
/**
 *
 * @author Esha
 */
public class CheckDirectoryExists {

    public static void main(String[] args){
        System.out.println("Please enter your file name to check that it exists. If it exists, the"
                + " contents of the folder will be displayed.");
       
        Scanner input = new Scanner(System.in);
        String dirName = input.nextLine();
        
       //make a pointer to a new file and the current directory:
        File newDir = new File("/Users/Esha/Desktop/"+ dirName);
        File currentDir = new File("/Users/Esha/Desktop/");
        //check if the newDir exists, if it does, then list the files/directories:
        if(newDir.exists()){      
        File[] listOfDirectories = newDir.listFiles();
        for (File temp: listOfDirectories){
       // if (temp.isDirectory()){//do this is you only want DIRECTORIES
            System.out.println(temp.getName());
        //}
        }
        }
        
        else if (!newDir.exists()){
        File list = new File("/Users/Esha/Desktop/"+ dirName);
        System.out.println("Creating a new directory with name: "+ dirName);
                list.mkdir(); 
        } 
    }
    }




