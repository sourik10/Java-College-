import java.lang.String;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      //uppercase-lowercase
      String s="Sourik";
      System.out.println(s.toUpperCase());
      System.out.println(s.toLowerCase());
      
      //trim method
      String a="   messi   ";
      System.out.println(a.trim());
      
      //boolean startswith && endswith
      String b="Sachin";    
    System.out.println(b.startsWith("Sa"));//true    
    System.out.println(b.endsWith("m"));//true   
    
    System.out.println(b.charAt(2));
    System.out.println(b.length());
    
    int c=20;
    System.out.println(String.valueOf(c));
    
    String ab="Messi-is-the-best-player-in-the-world";
    System.out.println(ab.replace("Messi","Ronaldo"));
    System.out.println(ab);
    
    }
}


/*
import java.lang.String;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      String s="Sushavan"; //String LiteralMethod
      String s2=new String("Sourav"); //String NewKeyword
      String s3="Subhransu";
      s= s.concat("Sourik");
     String s4="SOURIK";
     String s5="sourik";
      System.out.println(s);
      System.out.println(s2.concat(s));
      
      System.out.println(s.equals(s2));
      System.out.println(s.equals(s3));
      
      //Ignoring Case
      System.out.println(s5.equalsIgnoreCase(s4));
        
        System.out.println("ComapreTo method");
        String a="Messi";
        String b="Ronaldo";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        
    System.out.println("Substring in java");
    String c="Dwarhatta";
   // System.out.println(c.substring(10)); //StringIndexOutOfBoundsException
     System.out.println(c.substring(0,1)); //substring(staring,ending)  ---> endingIndex excluded
     
     System.out.println("SplitMethod");
     String ab="Messi-is-the-best-player-in-the-world";
     String[] ba=ab.split("-");
     System.out.println(Arrays.toString(ba)); 
     for(int i=0;i<ba.length;i++){
         System.out.print(ba[i]+" ");
     }
    }
}
*/
