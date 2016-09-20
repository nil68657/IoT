package WageCalculator;

import java.io.BufferedReader;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FooCorporation {
    public static double pay(double hours, double wage){
        double limitHours1 = 40.0;
        double limitHours2 = 60.0;
        double minWage = 8.0;
        double salary = 0;

        if(wage >= minWage){
        	
        
        if (hours <= limitHours1){
          salary = wage*hours;
             }
        else if (hours > limitHours1 && hours <=limitHours2) {
          salary = (wage*1.5*(hours-limitHours1))+(wage*limitHours1);
        }
        else{
          System.out.println("Not a valid work hours!");
       
        }

      }
        else{
        	System.out.println("Invalid wage");
        	
        }
        
        return salary;
    }
    

      public static void main(String[] args){

          String line=null;
          LinkedList<Double> l=new LinkedList<Double>();
          
          String fileName = "F:\\HOURS.txt";
         
          try {
                // FileReader reads text files in the default encoding.
                FileReader fileReader = new FileReader(fileName);

                // Always wrap FileReader in BufferedReader.
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((line = bufferedReader.readLine()) != null) {
                    String[] linesplit=line.split(",");
                    System.out.println(linesplit[0]+"\t"+linesplit[1]);
                    
                    Double salary=FooCorporation.pay(Double.parseDouble(linesplit[0]),Double.parseDouble(linesplit[1]));    
                    if(salary!=0.0){
                    	l.add(salary);
                    System.out.println(salary);
                }  
                }
               
                Collections.sort(l,null);
                System.out.println(l);
                // Always close files.
                bufferedReader.close();        
            }
            catch(FileNotFoundException ex) {
                System.out.println(
                    "Unable to open file '" + fileName + "'");               
            }
            catch(IOException ex) {
                System.out.println( "Error reading file '" + fileName + "'");                 
                // Or we could just do this:
                // ex.printStackTrace();
            } 
     
     
      }

}