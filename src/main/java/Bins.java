import java.util.TreeMap;

public class Bins {

    private TreeMap<Integer,Integer> _bins=new TreeMap<Integer, Integer>();

    public Bins(Integer firstBin, Integer lastBin){
        for(int i=firstBin;i<=lastBin;i++){
            _bins.put(i,0);
        }
    }
    public Integer getBin(Integer binNumber){
        return _bins.get(binNumber);
    }
    public void incrementBin(Integer binNumber){
        _bins.put(binNumber,_bins.get(binNumber)+1);
    }

}
