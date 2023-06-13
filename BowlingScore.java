import java.util.ArrayList;

public class BowlingScore {
    private int wickets;
    private int dotball;
    private int single;
    private int tworuns;
    private int threeruns;
    private int boundry;
    private int sixer;
    private int fiveruns;
    private int wide;
    private int byes;
    private int leg_byes;
    private int penalty_runs;
    private int noball;
    private int extras;
    private ArrayList bowlingover;

    public BowlingScore(){
        wickets = 0;
        dotball = 0;
        single = 0;
        tworuns = 0;
        threeruns = 0;
        boundry = 0;
        sixer = 0;
        fiveruns = 0;
        wide = 0;
        byes = 0;
        leg_byes = 0;
        penalty_runs = 0;
        noball = 0;
        extras = 0;
    }
    public void scorer(int runs){
        if (runs == 1){
            single += 1;
            bowlingover.add(1);
        }
        else if (runs == 2) {
            tworuns += 1;
            bowlingover.add(2);
        } else if (runs == 3) {
            threeruns += 1;
            bowlingover.add(3);
        } else if (runs == 4) {
            boundry += 1;
            bowlingover.add(4);
        } else if (runs == 5) {
            fiveruns += 1;
            bowlingover.add(5);
        } else if (runs == 6) {
            sixer += 1;
            bowlingover.add(6);
        }
    }

    public void setWide(int extraWide){
        extras += extraWide;
        wide += extraWide;
    }
    public int getWide(){
        return wide;
    }
    public void setByes(int numOfByes){
        extras += numOfByes;
        byes += numOfByes;

    }
    public int getByes(){
        return byes;
    }
    public void setLeg_byes(int numLegByes){
        extras += numLegByes;
        byes += numLegByes;
    }
    public int getLeg_byes(){
        return leg_byes;
    }
    public void setNoball(int numNoBall){
        extras += numNoBall;
        byes += numNoBall;
    }
    public int getNoball(){
        return noball;
    }
    public void setPenalty_runs(int numPenaltyRuns){
        extras += numPenaltyRuns;
        penalty_runs += numPenaltyRuns;
    }
    public int getPenalty_runs(){
        return penalty_runs;
    }
    public void setExtras(){
        extras = wide + byes + leg_byes + noball + penalty_runs;
    }
    public int getExtras(){
        return extras;
    }
}
