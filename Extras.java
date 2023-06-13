public class Extras {
    private int wide;
    private int byes;
    private int leg_byes;
    private int penalty_runs;
    private int noball;
    private int extras;

    public Extras(int wide, int byes, int leg_byes, int penalty_runs, int noball){

        wide = 0;
        byes = 0;
        leg_byes = 0;
        penalty_runs = 0;
        noball = 0;
        extras = 0;
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
