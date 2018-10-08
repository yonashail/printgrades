package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Keyboard= new Scanner(System.in);
        String option;
       do {
           int examscore;
           System.out.println("Enter examscore");
           examscore = Keyboard.nextInt();
           Keyboard.nextLine();

           if (examscore >= 90) {
               System.out.println("Good job. your grade is A");
           } else if (examscore >= 75) {
               System.out.println("Good job. your grade is B");
           } else if (examscore >= 60) {
               System.out.println("your grade is C.");
           } else if (examscore >= 50) {
               System.out.println("your grade is D.");
           } else {
               System.out.println("your grade is F.");
           }

               System.out.println("Do you want to insert another score(Y/N)?");
               option=Keyboard.nextLine();


       }
       while (option.equalsIgnoreCase("Y"));

           }
       }




