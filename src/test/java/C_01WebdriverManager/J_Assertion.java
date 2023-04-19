package C_01WebdriverManager;

import org.junit.Assert;
import org.junit.Test;

public class J_Assertion {

    @Test
    public void testing01(){
        // scene 1 equals to right value 10/2 == 5


        // scene 2 divide the values they cant 10/3 == 3.33


        // scene 3 10 / 0 return -1



    }

    @Test
    public void testingsc01(){
        int expected =5;
        int actual = divide(10,2);
        // expected == actual
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testingsc02(){
        double expected  = 3.5;
        int result = divide(7,2);
        Assert.assertEquals( expected,result);
    }
    @Test
    public void testing03(){
        double expected = -1;
        Assert.assertEquals(expected,divide(2,0));

    }
    public static int divide(int x , int y) {return x/y;}
}
