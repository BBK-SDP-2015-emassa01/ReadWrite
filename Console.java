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

 
public class Console {
public static String readLine() {
StringBuffer response = new StringBuffer();
try {
BufferedInputStream bin = new BufferedInputStream(System.in);
int in = 0;
String inChar;
do {
in = bin.read();
inChar = in+"";
if (in != -1) {
    response.append(inChar);
} 
} while ((in != -1) & (inChar != ""));
bin.close();
return response.toString();
} catch (IOException e) {
System.out.println("Exception: " + e.getMessage());
return null;
}
}
 public static void main(String[] arguments) {
 System.out.print("You are standing at the end of the road ");
 System.out.print("before a small brick building. Around you "); 
 System.out.print("is a forest. A small stream flows out of ");
 System.out.println("the building and down a gully.\n");
 System.out.print("> ");
 String input = Console.readLine();
 System.out.println("That’s not a verb I recognize.");
 }
 }
    

