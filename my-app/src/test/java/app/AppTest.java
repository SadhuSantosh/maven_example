package app;

import org.junit.Ignore;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class AppTest {

    double expected;
    double deposit;

    public AppTest(double expected,double deposit)
    {

        this.expected=expected;
        this.deposit=deposit;

    }
    @org.junit.Test
    public void deposit() {
        App b=new App("santosh",1000.00,Banker.CHECKING);
        b.deposit(deposit);

        assertEquals(expected,(Object)b.getBalance());

       // assertNotNull(Banker.firstname,"This string is not a null");

    }



    @Parameterized.Parameters
    public static Collection ret()
    {
        return Arrays.asList (new Object[][]{
                {1500.00,500.00},{1200.000,200.00},{1400.00,400.00}
        });
    }


    @Ignore       //@org.junit.jupiter.api.Test
    public static void withdraw() {
        App b= new App ("Santosh",2000.0,Banker.CHECKING);
        b.deposit (300.0);
       b.withdraw (500.00);
        assertEquals(1800.00,(Object)b.getBalance ());
    }
    @Ignore// @org.junit.jupiter.api.Test
    public static void getBalance() {


        App b= new App ("Santosh",1700.0,App.CHECKING);
        assertEquals(1700.00,(Object)b.getBalance());
    }


}
