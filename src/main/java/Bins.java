import java.util.TreeMap;

public class Bins {

    private TreeMap<Integer,Integer> binBoxes = new TreeMap<>();

    public Bins(Integer numberOfDice){
        for(Integer i = numberOfDice ; i <= (numberOfDice*6); i++){
            this.binBoxes.put(i,0);
        }
    }

    public void incrementBin(Integer binNumber){
        Integer newValue = this.binBoxes.get(binNumber)+1;
        this.binBoxes.put(binNumber,(newValue));

    }

    public Integer getBin(Integer binNumber){
        return binBoxes.get(binNumber);
    }

    public TreeMap<Integer, Integer> returnBinBoxes(){
        return binBoxes;
    }

    public Boolean hasBinBox(Integer binNumber){
        return (this.binBoxes.containsKey(binNumber));
    }

}
