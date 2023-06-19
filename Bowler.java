import java.io.*;
import java.lang.reflect.Array;

public class Bowler extends BowlingScore{

    private String bowlerName;
    private int overs;
    private double economy;
    private int maidens;


    public Bowler(String bowlerName ){
        super();
        bowlerName = this.bowlerName;
        overs = 0;
        economy = 0.0;
        maidens = 0;
    }

    public void createBowlingScorecard(){
        try {
            File bowlingscore = new File("BowlingScorecard.txt");
            bowlingscore.createNewFile();
            BufferedReader bfr = new BufferedReader(new FileReader(bowlingscore));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(bowlingscore, true));
            bfw.write(String.format("%20s %20s %20s %20s %20s %20s %20s %20s", "Bowler Name", "Over", "Maiden", "Runs", "Wickets", "ECON", "WD", "NB" ));
            bfw.flush();
            bfw.close();

        }
        catch (Exception e){

        }
    }

    public synchronized void bowlerover(String bowlerName, Integer[] over){
        try {
            File bowlingscore = new File("BowlingScorecard.txt");
            BufferedReader bfr = new BufferedReader(new FileReader(bowlingscore));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(bowlingscore, true));
            BufferedWriter bfw2 = new BufferedWriter(new FileWriter(bowlingscore, false));
            int overs = 0;
            int maiden = 0;
            int runs = 0;
            int wickets = 0;
            double econ = 0.0;
            int wide = 0;
            int noball = 0;
            for(int i = 0; i < over.length-1; i++){
                runs += over[i];
                if (i == 5){
                    overs += 1;

                }
            }
            if (bfr.readLine().contains(bowlerName)){
                bfw2.write(String.format("%20s %20s %20s %20s %20s %20s %20s %20s", bowlerName, "Over", "Maiden", "Runs", "Wickets", "ECON", "WD", "NB" ));
            }
            else{

            }
            bfw.write(String.format("%20s %20s %20s %20s %20s %20s %20s %20s", bowlerName, "Over", "Maiden", "Runs", "Wickets", "ECON", "WD", "NB" ));
        }
        catch (Exception e) {

        }
    }




}
