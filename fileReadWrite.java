/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Esha
 */
public class fileReadWrite {
    
    public static void main(String[] args){
        
        String filename = "/Users/Esha/Desktop";
//lists the directories in the Desktop. the '.' just means the current directory
// Be sure that you have a list of Files or a list of Directories.
       
        File file = new File(filename);
        
        File[] myFile = file.listFiles();
        
        for (File dir : myFile){
            if(dir.isDirectory()){
                System.out.println(dir.getName());
            }
            
            
        }
  
        
    }
}
