package com.manoj.learning.java.test;

import com.manoj.learning.java.Calculator;
import com.manoj.learning.java.exceptions.MyException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    int count;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeAll
     void init(TestInfo testInfo,TestReporter testReporter){
        count= 1;

        this.testInfo =   testInfo;
        this.testReporter = testReporter;

        System.out.println("In Before All " + testInfo.getClass());
        System.out.println("member variable before all " + this.testInfo.getClass());
        System.out.println("member variable before all... " + this.testInfo.getDisplayName());

    }

    @BeforeEach
    void check() {
        System.out.println("Test case "+count);
        testReporter.publishEntry("Executing Test case ::: "+ testInfo.getTestMethod());
        System.out.println("member variable " + this.testInfo.getTestMethod());
    }

    @AfterEach
    void afterTestCaseMethod() {
        count++;
        System.out.println("Test case ::: "+testInfo.getTestMethod());

    }

    @AfterAll
    void TearDown() {
        System.out.println("Total test case executed ::: "+count);
    }

    @Test
    @DisplayName("Addition")
    @Tag("Math")
    public void testAdd() {
        Calculator testObj = new Calculator();
        assertEquals(1, testObj.add(0, 1));
//		assertEquals(0, testObj.add(0, 0));
        System.out.println("test case = testAdd   "+ count);
    }

    @DisplayName("Subtraction test case....")
    @Tag("Math")
    @RepeatedTest(3)
    public void testSub() {
        Calculator testObj = new Calculator();
//		assertEquals("Subtraction is failed on purpose",1, testObj.sub(2,2));
//		assertEquals("failed message", 0, testObj.sub(2,2));
        assertEquals(0, testObj.sub(2,2),"failed message");
        testReporter.publishEntry("Inside sub test case");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @Tag("Math")
    public void testMultiply() {
        Calculator testObj = new Calculator();
        assertEquals(10, testObj.multiply(2,5),"Multiplication test case failed ");
        assertAll("Multiplication cases ",
                ()-> assertEquals(10, testObj.multiply(2,5),"Multiplication test case failed "),
                ()-> assertEquals(15, testObj.multiply(3,5),"Multiplication test case failed "),
                ()-> assertEquals(50, testObj.multiply(10,5),"Multiplication test case failed "),
                ()-> assertEquals(40, testObj.multiply(8,5),"Multiplication test case failed ")
        );
    }

    @Nested
    @DisplayName("Division test cases")
    class Divide{

        @Test
        public void testDivide() {
            Calculator testObj = new Calculator();
            assertEquals(2, testObj.divide(10,5),"Multiplication test case failed ");
//            System.out.println("test case = testDivide   "+ count);
        }

        @Test
        @DisplayName("Divide by zero")
        public void testDivideby0() {
            Calculator testObj = new Calculator();
            assertThrows(ArithmeticException.class, ()-> testObj.divide(1,0), "Testing for divide by zero");
//            System.out.println("test case = testDivideby0   "+ count);
        }

    }

    @Test
    @DisplayName("ExceptionTesting")
//    @Tag("Exception cases")
    public void testException(TestInfo testInfo,TestReporter testReporter){
        Calculator testObj = new Calculator();
        assertThrows(Exception.class, () -> testObj.divide(5,0));
        System.out.println(testInfo.getTestMethod());
        testReporter.publishEntry("HI Manoj");
    }
}