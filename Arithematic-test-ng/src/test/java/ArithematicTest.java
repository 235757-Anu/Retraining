import org.example.Arithematic;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArithematicTest
{

    Arithematic arithematic=null;
    int a,b;
    @BeforeTest
    void setUp()
    {
        arithematic = new Arithematic();
        a=50;
        b=5;
    }
    @AfterTest
    void tearDown()
    {
        arithematic=null;
        a=0;
        b=0;
    }
    @Test
    void TestingAddition()
    {
        Assert.assertEquals(55,arithematic.add(a,b));
    }
    @Test
    void TestingSubtraction()
    {
        Assert.assertEquals(45,arithematic.sub(a,b));
    }
    @Test
    void TestingMultiplication()
    {
        Assert.assertEquals(250,arithematic.mul(a,b));
    }
    @Test
    void TestingDivision()
    {
        Assert.assertEquals(10,arithematic.div(a,b));
    }
    @Test(expectedExceptions = ArithmeticException.class)
    void TestingDiv()
    {
        arithematic.div(5,0);
    }
    @Test
    void PrintOddNumber()
    {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        Assert.assertEquals("[1, 3, 5, 7, 9]",arithematic.printOddNumber(list).toString());
    }
}
