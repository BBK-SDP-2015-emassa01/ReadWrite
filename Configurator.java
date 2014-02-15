/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Esha
 */
class Configurator {

Configurator() {
try {
// load the properties file
File configFile = new File("/Users/Esha/Desktop/program.properties");
FileInputStream inStream = new FileInputStream(configFile);

Properties config = new Properties();
config.load(inStream);
// create a new property
Date current = new Date();
config.setProperty("runtime", current.toString());
// save the properties file
FileOutputStream outStream = new FileOutputStream(configFile);
write(outStream, "Esha Yes");
write(outStream, "Esha No");
write(outStream, "Esha Maybe");
config.store(outStream, "Properties settings again");
inStream.close();
config.list(System.out);
} catch (IOException ioe) {
System.out.println("IO error " + ioe.getMessage());
}
}

String newline = System.getProperty("line.separator");

void write(FileOutputStream stream, String output) throws IOException {
    output = output + newline;
byte[] data = output.getBytes();
stream.write(data, 0, data.length);
}

public static void main(String[] arguments) {
Configurator con = new Configurator();
}
}

