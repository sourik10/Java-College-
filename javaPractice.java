
class HelloWorld {
    public static void main(String[] args) {
        
      
      //integer,flaot,double
       int a=36;
       a=a>>2;
       System.out.println(a+" ");
       float f=a;
       System.out.println(f+" ");
       double d=76;
       System.out.println(d);
       
       
    
       //string datatype
                    
       String s1="rronaldor genjiir size ";  // 0-6
       System.out.println(s1+" ");
       
       String s2=new String("Messi");
       System.out.println(s2+" ");
      
       String output=s1+s2; //concatenation
       System.out.println(output+" ");
       
     //  System.out.println(s1.charAt(7)); //charAt
       System.out.println(s2.length()); //length method 
       System.out.println(s1.replace('r','R')); //replace method
       
       // substring(int startIndex, int endIndex):
       //startIndex included
       //endIndex excluded
       System.out.println(s1.substring(1,8));
       
  
       
       
       //array in java
       int [] marks=new int[10];
       marks[0]=78;
       marks[1]=90;
       marks[5]=98;
       for(int i=0;i<marks.length;i++){
           System.out.println(marks[i]);
       }
       
       
           */
       
    //implicit 
    float price = 100.00F;
    int gst = 18;
    float finalPrice = price + gst;
    System.out.println(finalPrice+" ");
    
    //explicit
    int pricee = 100; 
    float gstt = 18.00F; 
    int finalPricee = pricee + (int)gstt; 
    System.out.println(finalPricee);
    
    
        
 //input taking from user
 import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      a+=10;
      System.out.println(a);
    }
}
 
        
 // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.Math;
import java.util.Scanner; //taking user from input
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value for a: ");
     int a=sc.nextInt();
     System.out.println("enter value for b: ");
     int b=sc.nextInt();
     System.out.println(Math.max(a,b)+" "); //maxFunction
     System.out.println(Math.min(a,b)+" "); //minFunction
    // System.out.println((int)Math.sqrt(100)); //sqrt
     
    }
}
   
        
 //break + continue
public class MyClass {
    public static void main(String args[]) {
        
      for(int i=0;i<10;i++){
         if(i==5) continue;
          // if(i==5) break;
         System.out.println(i+" ");
    }
    }
}      
        
        
        
        
        
        
      
 //exception handling type1
       
public class MyClass {
    public static void main(String args[]) {
        
      String[] fb=new String[3]; //an array named "fb" of string datatype of size 3
      fb[0]="souvik";
      fb[1]="apurba";
      fb[2]="titli";
      
      //exception handling 
      try{
          System.out.println(fb[3]); //array index out of bound
      }
      catch(Exception e){
          System.out.println(e);
      }
      
    }
}
        
  //exception handling type2
        public class MyClass {
    public static void main(String args[]) {
        
     int a=10;
     int b=0;
      
      //exception handling 
      try{
          System.out.println(a/b);  //java.lang.ArithmeticException: / by zero
      }
      catch(Exception e){
          System.out.println(e);
      }
      
    }
}
        
//function
import java.util.Scanner;
class MyClass {
    
    //function defination
    public static int addNumbers(int first,int second,int third){
       int t=first+second+third;
        return t;
        //return first+second+third;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int xx=sc.nextInt();
        int c=addNumbers(a,b,xx); //function calling
        System.out.println(c);
        
        //System.out.println(addNumbers(a,b,x));
        
        //int x=99;
        //int y=99;
        //System.out.println(x+y);
        
      
    }
}
        
        
        
     
        
        
        
        
        

