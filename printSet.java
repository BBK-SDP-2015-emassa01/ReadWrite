
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class printSet {
    Set<Contacts> contactSet;
    
    
    public printSet(Set<Contacts> contactsSet){
        this.contactSet = contactsSet;
        
    }
    
    public void writeSetToFile(String filename) throws IOException{
        FileWriter write = new FileWriter(filename);
        BufferedWriter bufferWriter = new BufferedWriter(write);
        
        for (Contacts s:contactSet){
            write.append(s.getName()+",");
            write.append(s.getId()+",");
            write.append(s.getNotes());
            write.append("\n");
        }

        bufferWriter.close();
    }
    
    
    public void getId(Set<Contacts> nameOfContactSetToSearch, Contacts name){
        try{
        if (nameOfContactSetToSearch.contains(name)){
            System.out.println("The ID of contact "+name.getName() + " is "+name.getId());
        }
        }catch(NullPointerException e){
            e.printStackTrace();
        }
     
        
    }
    
    
    
}
