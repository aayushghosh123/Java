/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Scanner;
/**
 *
 * @author KIIT
 */
public class Takinginput {
    public static void main(String[] args){
       Scanner variable = new Scanner(System.in);
       String x = variable.nextLine();
       
       System.out.println("The text is "+ x);
    }
}
