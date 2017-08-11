
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import primary.Expert;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class factTestIT {
    public Expert ex;

    @BeforeClass
    public static void start(){
        System.out.println("Using Hamcrest! ");
    }

    @BeforeTest
    public void init(){
        ex = new Expert();
    }

    @Test
    public void testFact1(){

        assertThat(ex.fact(3),equalTo(6L));
        assertThat(ex.fact(4),is(24L));
        assertThat(ex.fact(2),is(equalTo(2L)));
        assertThat(ex.fact(5),is(greaterThan(100L)));
    }

    @Test
    public void testFact2(){

        List<Long> factList = new ArrayList<Long>();
        factList.add(ex.fact(2));
        factList.add(ex.fact(3));
        factList.add(ex.fact(4));
        factList.add(ex.fact(5));

        assertThat(factList,everyItem(greaterThan(1L)));
        assertThat(factList,containsInAnyOrder(120L,2L,24L,6L));
        assertThat(factList,hasSize(4));

    }
}
