/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ks;
import java.util.Scanner;

/**
 *
 * @author Karan
 */
public class sw {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner team = new Scanner(System.in);
        int  x,y,result;
        System.out.println("Enter the value of x :");
        x = team.nextInt();
        System.out.println("Ener the value of y :");
        y= team.nextInt();
        System.out.println("Enter the no. to perform:\n 1.Add \n 2.Sub \n 3.Mul\n 4.Div");
        result = team.nextInt();

        // TODO code application logic here
 
    switch (result){
    
        case 1:
            result =  x+y;
            System.out.println(result);
            break;
        case 2:
            result = x-y;
            System.out.println(result);
            break;
        case 3:
            result=x*y;
            System.out.println(result);
            break;
        case 4:
            result=x/y;
            System.out.println(result);
            break;
        default:
            System.out.println("Dont know what you looking for" );
            
    }
    
    
    }
    
    
}
