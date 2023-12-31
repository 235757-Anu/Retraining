package in.stackroute.ust;

import org.junit.jupiter.api.*;

 class CalculatorTest {

    private Calculator calculator;
    private int sumActual;
    private int expected;
    private int multiplyActual;

    @BeforeEach
    void setUp(){
        System.out.println("Setting up the test");
        calculator = new Calculator();
        sumActual = 0;
        expected = 0;
    }

    @AfterEach
    void tearDown(){
        System.out.println("Tearing down the test");
        calculator = null;
        sumActual = 0;
        expected = 0;
        System.out.println();
    }

    @Test
    @DisplayName("Test add with positive numbers")
    void testAddWithPositiveNumbers(){
        System.out.println("Test add with positive numbers");
        int sumActual = calculator.add(10, 20);
        int expected = 30;
        Assertions.assertEquals(expected, sumActual);
    }

    @Test
    @DisplayName("Test add with negative numbers")
    void testAddWithNegativeNumbers(){
        System.out.println("Test add with negative numbers");
        int sumActual = calculator.add(-10, -20);
        int expected = -30;
        Assertions.assertEquals(expected, sumActual);
    }

    /**
     * Write test cases for the multiply method
     * 1. Test with positive numbers
     * 2. Test with negative numbers
     * 3. Test with zero
     */

    @Test
    @DisplayName("Test multiply with positive numbers")
    void testMultiplyPositiveNumbers()
    {
        System.out.println("Test multiply with positive numbers");
        int multiplyActual=calculator.mul(10,20);
        int expected=200;
        Assertions.assertEquals(expected,multiplyActual);
    }

    @Test
    @DisplayName("Test multiply with negative numbers")
    void testMultiplyNegativeNumbers()
    {
        System.out.println("Test multiply with negative numbers");
        int multiplyActual=calculator.mul(-10,-20);
        int expected=200;
        Assertions.assertEquals(expected,multiplyActual);
    }
    @Test
    @DisplayName("Test multiply with zero")
    void testWithZero()
    {
        System.out.println("Test multiply with zero");
        int multiplyActual=calculator.mul(10,0);
        int expected=0;
        Assertions.assertEquals(expected,multiplyActual);
    }
}
