import java.util.Random;

public class Dice {

    private Integer numberOfDice;
    private Bins bins;

    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
        this.bins = new Bins(numberOfDice);
    }

    public Integer tossAndSum(){
        Random rand = new Random();
        Integer result = 0;
        for(int i = 0; i < numberOfDice;i++){
            result += (rand.nextInt(6)+1);
        }
        this.bins.incrementBin(result);
        return result;
    }


    public boolean checkValue(Integer randNum){
        if((randNum >=(1*numberOfDice)) && (randNum <=(numberOfDice*6))){
            return true;
        } else {return false;}

    }

    public Integer getNumberOfDice(){
        return this.numberOfDice;
    }


    public Bins getBins(){
        return  this.bins;
    }




}
