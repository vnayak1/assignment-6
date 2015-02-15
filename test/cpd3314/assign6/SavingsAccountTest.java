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
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
    }

    /**
     * Test of deposit method, of class SavingsAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double d = 100;
        double expResult = 600;
        SavingsAccount instance = new SavingsAccount(0.08, 500);
        instance.deposit(d);
        double result = instance.getBalance();
        assertEquals("Testing Constructor SavingsAccount(double rate, double "
                + "balance), SavingsAccount.deposit(double d), and "
                + "SavingsAccount.getBalance()",
                expResult, result, 0.01);
    }

    /**
     * Test of withdraw method, of class SavingsAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double w = 100.0;
        double expResult = 400;
        SavingsAccount instance = new SavingsAccount(0.08, 500);
        instance.withdraw(w);
        double result = instance.getBalance();
        assertEquals("Testing Constructor SavingsAccount(double rate, double "
                + "balance), SavingsAccount.withdraw(double w), and "
                + "SavingsAccount.getBalance()",
                expResult, result, 0.01);
    }

    /**
     * Test of calculateInterest method, of class SavingsAccount.
     */
    @Test
    public void testCalculateInterest() {
        System.out.println("calculateInterest");
        double expResult = 503.33333;
        SavingsAccount instance = new SavingsAccount(0.08, 500);
        instance.calculateInterest();
        double result = instance.getBalance();
        assertEquals("Testing Constructor SavingsAccount(double rate, double "
                + "balance), SavingsAccount.calculateInterest(), and "
                + "SavingsAccount.getBalance()",
                expResult, result, 0.01);
    }

    /**
     * Test of getBalance method, of class SavingsAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        SavingsAccount instance = new SavingsAccount(0.08, 500);
        double expResult = 500.0;
        double result = instance.getBalance();
        assertEquals("Testing Constructor SavingsAccount(double rate, double "
                + "balance), and SavingsAccount.getBalance()",
                expResult, result, 0.01);
    }

    /**
     * Test of getTotalDeposits method, of class SavingsAccount.
     */
    @Test
    public void testGetTotalDeposits() {
        System.out.println("getTotalDeposits");
        SavingsAccount instance = new SavingsAccount(0.08, 500);
        double expResult = 200.0;
        instance.deposit(100);
        instance.deposit(100);
        double result = instance.getTotalDeposits();
        assertEquals("Testing Constructor SavingsAccount(double rate, double "
                + "balance), SavingsAccount.deposit(double d), and "
                + "SavingsAccount.getTotalDeposits()",
                expResult, result, 0.01);
    }

    /**
     * Test of getTotalWithdrawals method, of class SavingsAccount.
     */
    @Test
    public void testGetTotalWithdrawals() {
        System.out.println("getTotalWithdrawals");
        SavingsAccount instance = new SavingsAccount(0.08, 500);
        double expResult = 200.0;        
        instance.withdraw(100);
        instance.withdraw(100);
        double result = instance.getTotalWithdrawals();
        assertEquals("Testing Constructor SavingsAccount(double rate, double "
                + "balance), SavingsAccount.withdraw(double w), and "
                + "SavingsAccount.getTotalWithdrawals()",
                expResult, result, 0.01);
    }

    /**
     * Test of getTotalInterest method, of class SavingsAccount.
     */
    @Test
    public void testGetTotalInterest() {
        System.out.println("getTotalInterest");
        SavingsAccount instance = new SavingsAccount(0.08, 500);
        double expResult = 6.68888;
        instance.calculateInterest();
        instance.calculateInterest();
        double result = instance.getTotalInterest();
        assertEquals("Testing Constructor SavingsAccount(double rate, double "
                + "balance), SavingsAccount.calculateInterest(), and "
                + "SavingsAccount.getTotalInterest()",
                expResult, result, 0.01);
    }
    
}
