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
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getYearModel method, of class Car.
     */
    @Test
    public void testGetYearModel() {
        System.out.println("getYearModel");
        int yearModel = 2012;
        String make = "Toyota Camry";
        Car instance = new Car(yearModel, make);
        int expResult = 2012;
        int result = instance.getYearModel();
        assertEquals("Testing Constructor new Car(yearModel, make) and method "
                + "Car.getYearModel()",
                expResult, result);        
    }

    /**
     * Test of getMake method, of class Car.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        int yearModel = 2012;
        String make = "Toyota Camry";
        Car instance = new Car(yearModel, make);
        String expResult = "Toyota Camry";
        String result = instance.getMake();
        assertEquals("Testing Constructor new Car(yearModel, make) and method "
                + "Car.getMake()",
                expResult, result);        
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        int yearModel = 2012;
        String make = "Toyota Camry";
        Car instance = new Car(yearModel, make);
        int expResult = 0;
        int result = instance.getSpeed();
        assertEquals("Testing Constructor new Car(yearModel, make) and method "
                + "Car.getSpeed()",
                expResult, result);        
    }

    /**
     * Test of accelerate method, of class Car.
     */
    @Test
    public void testAccelerate() {
        System.out.println("accelerate");
        int yearModel = 2012;
        String make = "Toyota Camry";
        Car instance = new Car(yearModel, make);
        instance.accelerate();
        int expResult = 5;
        int result = instance.getSpeed();
        assertEquals("Testing Constructor new Car(yearModel, make), methods "
                + "Car.accelerate(), and Car.getSpeed()",
                expResult, result);
    }

    /**
     * Test of brake method, of class Car.
     */
    @Test
    public void testBrake() {
        System.out.println("brake");
        int yearModel = 2012;
        String make = "Toyota Camry";
        Car instance = new Car(yearModel, make);
        instance.accelerate();
        instance.accelerate();
        instance.brake();
        int expResult = 5;
        int result = instance.getSpeed();
        assertEquals("Testing Constructor new Car(yearModel, make), methods "
                + "Car.accelerate(), Car.brake() and Car.getSpeed()",
                expResult, result);
    }
    
}
