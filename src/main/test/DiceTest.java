
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class DiceTest {

@Test
 public void diceConstructorTest() {
     //Given
     int numOfDice=3;
     Dice dice=new Dice(numOfDice);

     //When
     int actual=dice.get_numOfDice();
     //Then
     Assert.assertEquals(numOfDice,actual);
 }
 @Test
    public void tossAndSumTest(){
     int numOfDice=100;
     Dice dice=new Dice(numOfDice);
     int total=dice.tossAndSum();
     Logger log=Logger.getLogger(DiceTest.class.getName());
     log.info(Integer.toString(total));

 }



}