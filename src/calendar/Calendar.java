/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.Scanner;

/**
 *
 * @author aleshadoto
 */
public class Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int Y;
         String result ="";
         Scanner in = new Scanner(System.in);
         System.out.println("Write Year ");
         Y = in.nextInt();
         int animal = Y%12;
         int color = Y%10;
         switch (color){
            case 0: result = "Белый ";
                     break;
            case 1: result = "Белый ";
                     break;  
            case 2: result = "Черный ";
                     break;  
            case 3: result = "Черный ";
                     break;  
            case 4: result = "Зелёный ";
                     break;  
            case 5: result = "Зелёный ";
                     break;  
            case 6: result = "Красный ";
                     break; 
            case 7: result = "Красный ";
                     break;  
            case 8: result = "Желтый ";
                     break;  
            case 9: result = "Желтый ";
                     break;           
         }
              switch (animal){
            case 0 : result += "обезьяна ";
                     break;
            case 1: result += "петух ";
                     break;  
            case 2: result += "собака ";
                     break;  
            case 3: result += "свинья ";
                     break;  
            case 4: result += "крыса ";
                     break;  
            case 5: result += "бык ";
                     break;  
            case 6: result += "тигр ";
                     break; 
            case 7: result += "заяц ";
                     break;  
            case 8: result += "дракон ";
                     break;  
            case 9: result += "змея ";
                     break;
            case 10: result += "лошадь ";
                     break; 
            case 11: result += "овца ";
                     break; 
             
                
         }
              System.out.println(result);
 
         }}
    
    

