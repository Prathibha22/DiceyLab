import junit.framework.TestCase;
import org.junit.Assert;

public class BinsTest extends TestCase {


    public void testGetBin() {
        //Given
        Bins bins=new Bins(3,18);
        int expected=0;
        //When
        int actual= bins.getBin(5);
        //Then
        Assert.assertEquals(expected,actual);
    }

    public void testIncrementBin() {
        //Given
        Bins bins=new Bins(3,18);
        int expected=1;
        //When
         bins.incrementBin(5);
        int actual=bins.getBin(5);
        //Then
        Assert.assertEquals(expected,actual);
    }
}