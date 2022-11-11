import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

public class Simulation {
    Bins objBins;
    public static void main(String[] args){
        Simulation sim=new Simulation();
        int noOfDice=3;
        int noOfTosses=1000000;
        sim.runSimulation(noOfDice,noOfTosses);
        sim.printSimulation(noOfDice,noOfTosses);
    }
    public void runSimulation(Integer noOfDice,Integer noOfTosses) {
        Dice objDice = new Dice(noOfDice);
        objBins= new Bins(noOfDice, 6 * noOfDice);
        for (int i = 0; i < noOfTosses; i++) {
            Integer sum = objDice.tossAndSum();
            objBins.incrementBin(sum);
        }
    }
        public void printSimulation(int noOfDice,int noOfTosses){
            //Print Results
            System.out.println("***");
            System.out.println("Simulation of "+noOfDice+" dice tossed for "+noOfTosses+" times.");
            System.out.println("***\n");
            
            TreeMap<Integer,Integer> bin=new TreeMap<Integer, Integer>();
            bin= objBins.get_bins();
            for(Map.Entry<Integer ,Integer> entry : bin.entrySet()){
                System.out.print(" "+entry.getKey()+" :\t\t");
                System.out.print(entry.getValue()+"\t\t");
                DecimalFormat df=new DecimalFormat("0.00");
                Double binPercent=(entry.getValue())/(noOfTosses*1.00);
                System.out.print(df.format(binPercent)+"\t\t");
                for(int star=0;star<binPercent*100;star++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }

        }


    }



