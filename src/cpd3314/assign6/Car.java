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

package cpd3314.assign6;

/**
 * @author <vinayak shastri>
 */
public class Car {
    // TODO: Build the Car Class Here
    
    int yearmodel;  


    String make="";
    int speed;
    
    public Car(int yearmodel1 ,String make1)
    {
    yearmodel = yearmodel1;
    make = make1;
    speed=0;
    }



  public int getYearModel() {
        return yearmodel;
    }
  
  
      public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }
    
    public int accelerate()
    {
    speed = speed + 5;
    return speed;
    }
  
      public int brake()
    {
    speed = speed - 5;
    return speed;
    }
    
}