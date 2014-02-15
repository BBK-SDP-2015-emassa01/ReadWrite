
import java.io.IOException;
import java.util.HashSet;
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
public class mainPrintSet {
        
   public static void main(String[] args) throws IOException{
       
    Set<Contacts> contactsSet = new HashSet<>();
    
    Contacts esha = new Contacts();
    esha.setID(1);
    esha.setName("esha");
    esha.addNotes("Esha is a hardworking applicant.");
    contactsSet.add(esha);
    printSet test = new printSet(contactsSet);
    test.writeSetToFile("conacts.csv");
    
    Contacts margaux = new Contacts();
    margaux.setName("margaux");
    margaux.setID(2);
    margaux.addNotes("Margaux is a dedicated co-worker.");
    contactsSet.add(margaux);
    
    printSet test2 = new printSet(contactsSet);
    test2.writeSetToFile("conacts.csv");
    test.getId(contactsSet, esha);
    test.getId(contactsSet, margaux);
  
    
    }
   
   
    }

 
    

