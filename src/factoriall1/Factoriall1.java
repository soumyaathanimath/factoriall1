/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factoriall1;

import java.util.*;

/**
 *
 * @author dell1
 */
public class Factoriall1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
     
        long fact=1;
        
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        
        System.out.println("Factorial is "+fact);
        
    
    }
    
}
