/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author sanna
 */
public class Translator {
    public String wordReturn(String partOfSpeech,int theNumber){
       
        String[] words = null;
        String word = null;
        
        if (partOfSpeech.equals("adj")) {
            words = new String[] {"stor", "liten", "stark", "svag","mjuk", "hård","snabb","vacker","ljus","mörk"};
        } else if (partOfSpeech.equals("sub")) { 
            words = new String[] {"en lönehöjning", "en lönesänkning", "en fotboja","en katt", "en hund", "ett hus", "ett barn", "ett elstängsel","en dator", "ett golv"};
        } else if (partOfSpeech.equals("verb")) { 
            words= new String[] {"springa", "ljuga", "flyga", "se","vara","äta","mäta","gå","röra","resa"};
	} else {
            return "Error";
        }    
	
        
        word = words[theNumber];
        
        return word;
        
    }     

}
