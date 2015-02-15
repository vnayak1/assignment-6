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
package cpd3314.assign6;

/**
 * @author <vinayak shastri>
 */
public class Circle {
    // TODO: Build the Circle Class here
    
    private double radius;
    
    
    final double PI = 3.14159;
    
    
    public Circle(double rad){
    radius = rad;
    }
    public Circle(){
    radius = 0;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
    
    return PI*radius*radius;
    }
    
    public double getDiameter(){
    
    return radius*2;
    }
    
    public double getCircumference(){
    
    return 2*PI*radius;
    }
}
