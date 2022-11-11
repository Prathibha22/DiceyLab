import java.security.PublicKey;

public class Simulation {
    public static void main(String[] args){
        Simulation sim=new Simulation();
        sim.runSimulation(6,100);
    }
    public void runSimulation(Integer noOfDice,Integer nuOfTosses){
        Dice objDice=new Dice(noOfDice);
        Bins objBins=new Bins(noOfDice,6*noOfDice);
        for(int i=0;i<nuOfTosses;i++){
            Integer sum=objDice.tossAndSum();
            objBins.incrementBin(sum);
        }
    }

}
