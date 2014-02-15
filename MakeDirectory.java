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
public class MakeDirectory {
    
    public static void main(String[] args){
        System.out.println("Please enter your file name");
        Scanner input = new Scanner(System.in);
        String dirName = input.nextLine();
        
        File dir = new File("/Users/Esha/Desktop/"+ dirName);
        dir.mkdir();
    }
    
}
