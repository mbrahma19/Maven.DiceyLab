import java.util.Set;

public class Simulation {

    private Integer numberOfDice;
    private Integer numberOfRolls;
    private Dice myDice;
    private Bins myBin;


    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
        this.myDice = new Dice(numberOfDice);
        this.myBin = myDice.getBins();
    }

    public void runSimulation(){
        for(Integer i = 1; i <= this.numberOfRolls; i++){
            this.myDice.tossAndSum();
        }
    }


    public void printResults(){
        String output = String.format("***\nSimulation of %d dice tossed for %d times.\n***\n", numberOfDice,numberOfRolls);
        Set<Integer> mySet = this.myBin.returnBinBoxes().keySet();

        for(Integer key : mySet){
            double percentage = (double)myBin.getBin(key)/(double)numberOfRolls;
            output += String.format("%2d :%9d : %.2f %s\n",key,this.myBin.getBin(key),percentage,printStars(percentage));
        }

        System.out.println(output);
    }

    public String printStars(Double percentage){
        String output = "";

        for(double d = 0.0 ; d < percentage ; d+=0.01){
            output += "*";
        }
        return output;
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }


}
