
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import primary.Basic;
import static org.assertj.core.api.Assertions.*;


import java.util.ArrayList;

public class AddTestIT {
    public Basic ex;

    @BeforeClass
    public static void start(){
        System.out.println("Using AssertJ! ");
    }

    @BeforeTest
    public void setup(){

        ex = new Basic();
    }


    @Test(invocationCount = 2)
    public void testAdd1(){

        assertThat(ex.add(3,3)).isBetween(2L,7L);
        assertThat(ex.add(2,2)).isEqualTo(4L);
        assertThat(ex.add(-3,3)).isZero();
    }

    @Test(invocationCount = 2)
    public void testAdd2(){

        assertThat(ex.add(-1.0)).isNegative();
        assertThat(ex.add(100,200)).isGreaterThanOrEqualTo(299);
        assertThat(ex.add(6,3)).isEqualByComparingTo(ex.add(3,6));
    }

}
