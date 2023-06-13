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

    public void completeScorecard(String bowlerName, Integer[] over ){
        try {
            File bowlingscore = new File("BowlingScorecard.txt");
            BufferedReader bfr = new BufferedReader(new FileReader(bowlingscore));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(bowlingscore,true));

        }
        catch (Exception e){

        }

    }
    public Array bowlerover(String bowlerName, Integer[] over){

    }




}
