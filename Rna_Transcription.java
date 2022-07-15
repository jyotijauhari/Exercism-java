/*
Task1: 

Given a DNA strand, its transcribed RNA strand is formed by replacing each nucleotide with its complement:

G -> C
C -> G
T -> A
A -> U
*/

//way1
class RnaTranscription {
    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder(dnaStrand);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch=='G'){
                sb.setCharAt(i,'C');
            }
            else if(ch=='C'){
                sb.setCharAt(i,'G');
            }
            else if(ch=='T'){
                sb.setCharAt(i,'A');
            }
            else if(ch=='A'){
                sb.setCharAt(i,'U');
            }
        }
        return sb.toString();
    }
}

//way2 - switch case

//way3 : hashmap
import java.util.*;
class RnaTranscription {
    String transcribe(String dnaStrand) 
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("G","C");
        map.put("C","G");
        map.put("T","A");
        map.put("A","U");
        
        String str="";
        for(int i=0;i<dnaStrand.length();i++)
        {     
                str+=map.get(dnaStrand.substring(i,i+1));
        }
        return str;
    }
}
