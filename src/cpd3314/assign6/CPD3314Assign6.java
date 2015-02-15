/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 * updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */
package cpd3314.assign6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author <vinayak shastri>
 */
public class CPD3314Assign6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO: This is a sandbox. 

        /* Modify it and use it to call whatever objects and methods you want.
         * 
         * To be clear: Your task is to create methods. All of the automated
         * tests in CPD3314Assign6Test.java are based on the classes described
         * below or in other files. So for example, in Ex#2, you must build the 
         * Car class. The automated tests will tell you if you built it correctly.
         *
         */
        
           int choice;
        Scanner in = new Scanner(System.in);
        CPD3314Assign6 cpd = new CPD3314Assign6();
        do {
            System.out.println("Which exercise would you like to run? [2,7,10,11] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 2:
                     
                     cpd.doExercise2();
                    break;
                case 7:
                    
                      cpd.doExercise7();
                    break;
                case 10:
                     
                     cpd.doExercise10();
                    break;
                case 11:
                    cpd.doExercise11();
                    break;
                
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
     
        
    }

    /* Exercise #2 - Car Class
     * 
     * Write a class named Car that has the following fields:
     * - yearModel. The yearModel field is an int that holds the car's year model.
     * - make. The make field references a String object that holds the make of the car.
     * - speed. The speed field is an int that holds the car's current speed.
     * In addition, the class should have the following constructor and other methods.
     * - Constructor. The constructor should accept the car's year model and make as
     *     arguments. These values should be assigned to he object's yearModel and 
     *     make fields. The constructor should also assign 0 to the speed field.
     * - Accessors. Appropriate accessor methods should get the values stored in an 
     *     object's yearModel, make, and speed fields.
     * - accelerate. The accelerate method should add 5 to the speed field each time 
     *     it is called.
     * - brake. The brake method should subtract 5 from the speed field each time it 
     *     is called.
     * In the main class (CPD3314Assign6), demonstrate the class in a program that 
     * creates a Car object, and then calls the accelerate method five times. After 
     * each call to the accelerate method, get the current speed of the car and 
     * display it. Then call the brake method five times. After each call to the 
     * brake method, get the current speed of the car and display it.
     * - Gaddis pg. 400-1
     */
    public void doExercise2() {
        // TODO: Complete the main-class portion of Exercise #2 here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year of model:");
        int ym = s.nextInt();
        
        System.out.println("Enter the make:");
        String mk = s.next();     
        Car c = new Car(ym,mk);
        
      
        System.out.println("current speed after first Accelerate :"+c.accelerate());
        System.out.println("current speed after second Accelerate:"+c.accelerate());
        System.out.println("current speed after third Accelerate:"+c.accelerate());
        System.out.println("current speed after four Accelerate:"+c.accelerate());
        System.out.println("current speed after five Accelerate:"+c.accelerate());
        
        
        System.out.println("current speed after first Brake:"+c.brake());
        System.out.println("current speed after second Brake:"+c.brake());
        System.out.println("current speed after third Brake:"+c.brake());
        System.out.println("current speed after four Brake:"+c.brake());
        System.out.println("current speed after five Brake:"+c.brake());
    }

    /* Exercise #7 - Circle Class
     *
     * Write a Circle class that has the following fields:
     * - radius: a double
     * - PI: a final double initialized with the value 3.14159
     * The class should have the following methods:
     * - Constructor. Accepts the radius of the circle as an argument.
     * - Constructor. A no-arg constructor that sets the radius field to 0.0.
     * - setRadius. A mutator method for the radius field.
     * - getRadius. An accessor method for the radius field.
     * - getArea. Returns the area of the circle, which is calculated as
     *     area = PI * radius * radius
     * - getDiameter. Returns the diameter of the circle, which is calculated as
     *     diameter = radius * 2
     * - getCircumference. Returns the circumference of the circle, which is
     *     calculated as
     *     circumference = 2 * PI * radius
     * In the main class (CPD3314Assign6), demonstrate the Circle class by 
     * asking the user for the circle's radius, creating a Circle object, and 
     * then reporting the circle's area, diameter, and circumference.
     * - Gaddis pg- 402
     */
    public void doExercise7() {
        // TODO: Complete the main-class portion of Exercise #7 here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double r = s.nextDouble();
        
        Circle c = new Circle(r);
        System.out.println("Area of circle:" +c.getArea());
        System.out.println("diameter of circle:"+c.getDiameter());
        System.out.println("circumference of circle:"+c.getCircumference());
        
   
        
        
        
    }

    /* Exercise #10 & 11 - SavingsAccount Class
     * 
     * Design a SavingsAccount class that stores a savings account's annual 
     * interest rate and balance. The class constructor should accept the amount 
     * of the savings account's starting balance. The class should also have 
     * methods for subtracting the amount of a withdrawal, adding the amount of 
     * a deposit, and adding the amount of monthly interest to the balance. The 
     * monthly interest rate the annual interest rate divided by twelve. To add 
     * the monthly interest to the balance, multiply the monthly interest rate 
     * by the balance, and add the result to the balance.
     *
     * NOTE: Not all required methods are described here. 
     * 
     * The following methods (and associated unit tests) will tell you if you
     * are on the right track.
     * - Gaddis pg- 403-4
     */
    public void doExercise10() {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is the annual interest rate? (eg- 0.013)");
        double annualRate = kb.nextDouble();
        System.out.println("What is the starting balance? (eg- 10000)");
        double balance = kb.nextDouble();
        SavingsAccount sa = new SavingsAccount(annualRate, balance);
        System.out.println("How many months have passed since the account was "
                + "established?");
       int months = kb.nextInt();
       double deposits = 0;
        double withdrawals = 0;
        for (int i = 1; i <= months; i++) {
            System.out.println("How much was deposited in month " + i + "?");
            double deposit = kb.nextDouble();
            sa.deposit(deposit);
            System.out.println("How much was withdrawn in month " + i + "?");
            double withdrawal = kb.nextDouble();
            sa.withdraw(withdrawal);
            sa.calculateInterest();
      }
        System.out.printf("Ending Balance: %.2f\n", sa.getBalance());
        System.out.printf("Total Deposits: %.2f\n", sa.getTotalDeposits());
        System.out.printf("Total Withdrawals: %.2f\n", sa.getTotalWithdrawals());
        System.out.printf("Total Interst: %.2f\n", sa.getTotalInterest());
    }
   public void doExercise11() throws IOException {
        File dFile = new File("Deposits.txt");
        Scanner deposits = new Scanner(dFile);
        File wFile = new File("Withdrawals.txt");
        Scanner withdrawals = new Scanner(wFile);

        SavingsAccount sa = new SavingsAccount(0.08, 500.00);

        while (deposits.hasNext()) {
           sa.deposit(deposits.nextDouble());
        }
        while (withdrawals.hasNext()) {
            sa.withdraw(withdrawals.nextDouble());
        }
        sa.calculateInterest();
        System.out.printf("Ending Balance: %.2f\n", sa.getBalance());
        System.out.printf("Total Interst: %.2f\n", sa.getTotalInterest());
    }
    
    
    }
