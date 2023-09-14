/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.pkg09;

import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a:");
        a=inp.nextInt();
           System.out.println("Enter the value of b:");
        b=inp.nextInt();
        System.out.println(a& b);
        System.out.println(a | b);
        System.out.println(a << b);
        System.out.println(a >> b);
        System.out.println(a ^ b);
        
        
        
    }
    
}
