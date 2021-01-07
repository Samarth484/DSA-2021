import java.io.*;
import java.util.*;

public class PrintEncodings{
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    String str=scn.nextLine();
    printEncodings(str);
    }

    public static void printEncodings(String str) {
    printEncodings(str,"");
    }
    
    public static void printEncodings(String ques, String ans){
       
       if(ques.length()==0)
       {
           System.out.println(ans);
           return;
       }
       
       
        for(int i=0;i<ques.length(); i++){
           String partition=ques.substring(0,i+1);
           if(partition.charAt(0)=='0')
           continue;
           String roq=ques.substring(i+1);
           long parInint=Long.parseLong(partition);
          if(parInint<=26 && parInint>0){
              char ch = (char)(96+parInint);
              printEncodings(roq,ans+ch);
          }
            
        }
    }

}