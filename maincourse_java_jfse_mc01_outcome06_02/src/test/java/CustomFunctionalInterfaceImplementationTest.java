import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomFunctionalInterfaceImplementationTest
{
    private CustomFunctionalInterfaceImplementation customFunctionalInterfaceImplementation;

    @BeforeEach
    public void setUp()
    {
        customFunctionalInterfaceImplementation=new CustomFunctionalInterfaceImplementation();
    }
    @Test
    public void GivenAnInputStringAsNull()
    {
        assertEquals("Null String",customFunctionalInterfaceImplementation.myFunction.doJob(null));
    }
    @Test
    void testGetChangedCaseWithoutNullInput()
    {
        assertEquals("STRiNG",customFunctionalInterfaceImplementation.myFunction.doJob("strIng"));
    }
    @Test
    void testMyFunctionIntCaseWithNullInput()
    {
        assertEquals(null,customFunctionalInterfaceImplementation.myFunction1.doJob(null));
    }
    @Test
    void testMyFunctionIntWithoutNullInput()
    {
        assertEquals(8,customFunctionalInterfaceImplementation.myFunction1.doJob(2));
    }
    @AfterEach
    public void tareDown()
    {
        customFunctionalInterfaceImplementation=null;
    }
}
