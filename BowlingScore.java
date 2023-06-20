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
    public synchronized ArrayList scorer(String ballrep){
        if (ballrep == "single" || ballrep.equals("1")){
            single += 1;
            bowlingover.add(1);
        }
        else if (ballrep == "two runs" || ballrep.equals("2")) {
            tworuns += 1;
            bowlingover.add(2);
        } else if (ballrep.equals("3")) {
            threeruns += 1;
            bowlingover.add(3);
        } else if (ballrep.equals("4")) {
            boundry += 1;
            bowlingover.add(4);
        } else if (ballrep.equals("5")) {
            fiveruns += 1;
            bowlingover.add(5);
        } else if (ballrep.equals("6")) {
            sixer += 1;
            bowlingover.add(6);
        } else if (ballrep.equals("W")) {
            wickets += 1;
            bowlingover.add("W");
        } else if (ballrep.equals("++") || ballrep.equals("+") || ballrep.equals("+++")|| ballrep.equals("++++")|| ballrep.equals("+++++")|| ballrep.equals("++++++")) {
            if (ballrep.length() == 1){
                wide += 1;
                bowlingover.add("+");
            } else if (ballrep.length() == 2) {
                wide += 2;
                bowlingover.add("++");
            } else if (ballrep.length() == 3) {
                wide += 3;
                bowlingover.add("+++");
            } else if (ballrep.length() == 4) {
                wide +=4;
                bowlingover.add("++++");
            } else if (ballrep.length() == 5) {
                wide +=5;
                bowlingover.add("+++++");
            } else if (ballrep.length() == 6) {
                wide +=6;
                bowlingover.add("++++++");
            }
        } else if (ballrep.equals("b1") || ballrep.equals("b2") || ballrep.equals("b3") || ballrep.equals("b4") || ballrep.equals("b5") || ballrep.equals("b6")) {
            if (ballrep.contains("1")){
                byes += 1;
                bowlingover.add("b1");
            } else if (ballrep.contains("2")) {
                byes += 2;
                bowlingover.add("b2");
            } else if (ballrep.contains("3")) {
                byes += 3;
                bowlingover.add("b3");
            } else if (ballrep.contains("4")) {
                byes +=4;
                bowlingover.add("b4");
            } else if (ballrep.contains("5")) {
                byes +=5;
                bowlingover.add("b5");
            } else if (ballrep.contains("6")) {
                byes +=6;
                bowlingover.add("b6");
            }
        } else if (ballrep.equals("lb1") || ballrep.equals("lb2") || ballrep.equals("lb3") || ballrep.equals("lb4") || ballrep.equals("lb5") || ballrep.equals("lb6")) {
            if (ballrep.contains("1")){
                leg_byes += 1;
                bowlingover.add("lb1");
            } else if (ballrep.contains("2")) {
                leg_byes += 2;
                bowlingover.add("lb2");
            } else if (ballrep.contains("3")) {
                leg_byes += 3;
                bowlingover.add("lb3");
            } else if (ballrep.contains("4")) {
                leg_byes +=4;
                bowlingover.add("lb4");
            } else if (ballrep.contains("5")) {
                leg_byes +=5;
                bowlingover.add("lb5");
            } else if (ballrep.contains("6")) {
                leg_byes +=6;
                bowlingover.add("lb6");
            }
        } else if (ballrep.equals("nb") || ballrep.equals("nb1") || ballrep.equals("nb2") || ballrep.equals("nb3") || ballrep.equals("nb4") || ballrep.equals("nb5") || ballrep.equals("nb6")) {
            if (ballrep.contains("1")){
                noball += 2;
                bowlingover.add("nb1");
            } else if (ballrep.contains("2")) {
                noball += 3;
                bowlingover.add("nb2");
            } else if (ballrep.contains("3")) {
                noball += 4;
                bowlingover.add("nb3");
            } else if (ballrep.contains("4")) {
                noball +=5;
                bowlingover.add("nb4");
            } else if (ballrep.contains("5")) {
                noball +=6;
                bowlingover.add("nb5");
            } else if (ballrep.contains("6")) {
                noball +=7;
                bowlingover.add("nb6");
            } else {
                noball +=1;
                bowlingover.add("nb");
            }
        }

        return bowlingover;
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
