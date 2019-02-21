import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void constructorTest(){
        //given
        Bins newBins = new Bins(1);
        //when
        boolean bin1 = newBins.hasBinBox(1);
        boolean bin2 = newBins.hasBinBox(2);
        boolean bin3 = newBins.hasBinBox(3);
        boolean bin4 = newBins.hasBinBox(4);
        boolean bin5 = newBins.hasBinBox(5);
        boolean bin6 = newBins.hasBinBox(6);
        //then
        Assert.assertEquals(true, bin1);
        Assert.assertEquals(true, bin2);
        Assert.assertEquals(true, bin3);
        Assert.assertEquals(true, bin4);
        Assert.assertEquals(true, bin5);
        Assert.assertEquals(true, bin6);
    }

    @Test
    public void constructorTestWith2Dice(){
        //given
        Bins newBins = new Bins(2);
        //when
        boolean bin2 = newBins.hasBinBox(2);
        boolean bin3 = newBins.hasBinBox(3);
        boolean bin4 = newBins.hasBinBox(4);
        boolean bin5 = newBins.hasBinBox(5);
        boolean bin6 = newBins.hasBinBox(6);
        boolean bin7 = newBins.hasBinBox(7);
        boolean bin8 = newBins.hasBinBox(8);
        boolean bin9 = newBins.hasBinBox(9);
        boolean bin10 = newBins.hasBinBox(10);
        boolean bin11 = newBins.hasBinBox(11);
        boolean bin12 = newBins.hasBinBox(12);
        //then

        Assert.assertEquals(true, bin2);
        Assert.assertEquals(true, bin3);
        Assert.assertEquals(true, bin4);
        Assert.assertEquals(true, bin5);
        Assert.assertEquals(true, bin6);
        Assert.assertEquals(true, bin7);
        Assert.assertEquals(true, bin8);
        Assert.assertEquals(true, bin9);
        Assert.assertEquals(true, bin10);
        Assert.assertEquals(true, bin11);
        Assert.assertEquals(true, bin12);
    }

    @Test
    public void incrementBinTest(){
        //given
        Bins newBins = new Bins(1);

        //when
        newBins.incrementBin(2);
        int actual = newBins.getBin(2);

        //then
        Assert.assertEquals(1, actual);

    }


}
