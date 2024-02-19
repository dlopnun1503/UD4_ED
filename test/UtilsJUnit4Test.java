/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author dlopnun1503
 */
public class UtilsJUnit4Test {
    
    public UtilsJUnit4Test() {
    }
    
    @BeforeClass 
public static void setUpClass() throws Exception {
 System . out .println( " * UtilsJUnit4Test: método @BeforeClass " ); 
}

    
    @AfterClass 
public static void tearDownClass() throws Exception {
  System . out .println( " * UtilsJUnit4Test: método @AfterClass " ); 
}
    
    @Before 
 public void setUp () {
 System . out .println( " * UtilsJUnit4Test: @Antes del método " ); 
}

    
    @After 
public void tearDown() {
  System . out .println( " * UtilsJUnit4Test: método @After " );  
}

@Test public void helloWorldCheck() 
{
  System . out .println( " * UtilsJUnit4Test: método de prueba 1 - helloWorldCheck() " );
  assertEquals("¡Hola, mundo!", Utils.concatWords("¡Hola", ", ", "mundo", "!")); 
}    

@Test ( timeout = 1000 )  
public void testWithTimeout() { 
final int factorialOf = 1 + (int) (30000 * Math.random());
System.out.println("informática" + factorialOf + '!'); 
System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf)); 
System . out .println( " * UtilsJUnit4Test: método de prueba 2 - testWithTimeout() " );
}

@Test  ( expected = IllegalArgumentException . class)
public void checkExpectedException() { 
System . out .println( " * UtilsJUnit4Test: método de prueba 3 - checkExpectedException()" ); 
final int factorialOf = -5;
System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf)); 
}

@Ignore
@Test 
public void temporarilyDisabledTest() throws Exception{
System.out.println(" UtilsJUnit4Test: método de prueba 4 -checkExpectedException()"); assertEquals("Malm\u00f6", Utils.normalizeWord("Malm\u0308")); 
}


}
