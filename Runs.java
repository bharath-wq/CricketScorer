import java.lang.reflect.Array;
import java.util.ArrayList;
public class Runs {
    private int single_run;
    private int double_runs;
    private int triple_runs;
    private int five_runs;
    private int boundry_runs;
    private int sixer_runs;
    private int runs;

    public Runs(int single_run, int double_runs, int triple_runs, int boundry_runs, int five_runs, int sixer_runs, int runs){
        single_run = this.single_run;
        double_runs = this.double_runs;
        triple_runs = this.triple_runs;
        boundry_runs = this.boundry_runs;
        five_runs = this.five_runs;
        sixer_runs = this.sixer_runs;
        runs = this.runs;
    }
    public Runs(){
        single_run = 0;
        double_runs = 0;
        triple_runs = 0;
        boundry_runs = 0;
        five_runs = 0;
        sixer_runs = 0;
        runs = 0;
    }

    public Runs(int runs) {
        runs = this.runs;
    }

    public void setSingle_run(boolean run){
        runs += 1;
        single_run += 1;
    }
    public int getSingle_run(){
        int singles = single_run;
        return singles;
    }
    public void setDouble_runs(boolean run){
        runs += 2;
        double_runs += 1;
    }
    public int getDouble_runs(){
        int doubles = double_runs;
        return doubles;
    }
    public void setTriple_runs(boolean run){
        runs += 3;
        triple_runs += 1;
    }
    public int getTriple_runs(){
        int triples = triple_runs;
        return triples;
    }
    public void setBoundry_runs(boolean run){
        runs += 4;
        boundry_runs += 1;
    }
    public int getBoundry_runs(){
        return boundry_runs;
    }
    public void setFive_runs(boolean run){
        runs += 5;
        five_runs += 1;

    }
    public int getFive_runs(){
        return five_runs;
    }
    public void setSixer_runs(boolean run){
        single_run += 1;
        runs += 6;
    }
    public int getSixer_runs(){
        return sixer_runs;
    }
    public int getRuns(){
        return runs;
    }
}
