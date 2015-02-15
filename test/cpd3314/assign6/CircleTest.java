/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
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

package cpd3314.assign6;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CircleTest {
    
    public CircleTest() {
    }

    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double r = 0.0;
        Circle instance = new Circle();
        instance.setRadius(r);
        double result = instance.getRadius();
        assertEquals("Testing methods Circle.setRadius() and Circle.getRadius()",
                r, result, 0.01);
    }

    /**
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Circle instance = new Circle(4);
        double expResult = 4.0;
        double result = instance.getRadius();
        assertEquals("Testing Constructor Circle(double) and Circle.getRadius()",
                expResult, result, 0.01);        
    }

    /**
     * Test of getArea method, of class Circle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Circle instance = new Circle(4);
        double expResult = 50.26548;
        double result = instance.getArea();
        assertEquals("Testing Constructor Circle(double) and Circle.getArea()",
                expResult, result, 0.01);        
    }

    /**
     * Test of getDiameter method, of class Circle.
     */
    @Test
    public void testGetDiameter() {
        System.out.println("getDiameter");
        Circle instance = new Circle(4);
        double expResult = 8.0;
        double result = instance.getDiameter();
        assertEquals("Testing Constructor Circle(double) and Circle.getDiameter()",
                expResult, result, 0.01);
    }

    /**
     * Test of getCircumference method, of class Circle.
     */
    @Test
    public void testGetCircumference() {
        System.out.println("getCircumference");
        Circle instance = new Circle(4);
        double expResult = 25.13274;
        double result = instance.getCircumference();
        assertEquals("Testing Constructor Circle(double) and Circle.getCircumference()",
                expResult, result, 0.01);
    }
    
}
