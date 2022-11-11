public class Dice {

    private int _numOfDice;
    private int _sumOfDice;
    public int get_numOfDice() {
        return _numOfDice;
    }
    public Dice(int numOfDice){
        this._numOfDice=numOfDice;
    }
    public int tossAndSum(){
        _sumOfDice=0;
        for(int i=0;i<_numOfDice;i++){
            int diceNumber= (int) (Math.random()*6+1);
            _sumOfDice+=diceNumber;
        }
        return _sumOfDice;
    }


}
