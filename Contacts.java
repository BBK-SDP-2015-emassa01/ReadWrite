/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Contacts {
    private String name;//of contact
    private String notes; //about contact
    private int id = 0; //contact's id number
    
    public Contacts(){
    
        
    }
//  public Contacts(String name)
//        setName(name);
//        setID(id);
//        id = id+1;  
//    }
    
    public int getId(){
        return this.id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getNotes(){
        if (notes ==null){//must return notes even if no notes available (in which case returns emply string).
            return "";
        }
        return this.notes;
    }
    public void addNotes(String note){
        this.notes = note;
    }
    
}
