import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testConstructor(){
        //given
        Integer expected = 2;
        Dice myDice = new Dice(2);
        //when
        Integer actual = myDice.getNumberOfDice();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRandomIsWithinBounds(){
        //given
        Dice myDice = new Dice(2);
        Integer randNum = myDice.tossAndSum();
        //when
        boolean actual = myDice.checkValue(randNum);
        //then
        Assert.assertEquals(true,actual);
    }


    @Test
    public void testTossAndSum(){
        //given
        Dice myDice = new Dice(2);
        Integer sum = myDice.tossAndSum();
        Integer expected = 1;
        //when
        Integer actual = myDice.getBins().getBin(sum);
        //then
        Assert.assertEquals(expected,actual);
    }

}
