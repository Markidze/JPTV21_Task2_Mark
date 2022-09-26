/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21_task2_mark;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21_Task2_Mark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите трехзначное число: ");
    int num = scanner.nextInt();
    int sum = (num/100);
    int sum1 = (num%100/10);
    int sum2 = (num%100%10);
    System.out.println(sum + sum1 + sum2);
    }
    
}
