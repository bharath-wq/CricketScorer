public class Batsman extends Runs{
    private String batsman;
    private int balls;
    private double strikeRate;

    public Batsman(String batsman){
        super();
        batsman = this.batsman;
        balls = 0;
        strikeRate = 0.00;
    }

    public void setBatsman(String batsman2){
        batsman = batsman2;
    }
    public String getBatsman(){
        return batsman;
    }
    public double calculateStrikeRate(){
        strikeRate = (super.getRuns() / getBalls()) * 100;
        return strikeRate;

    }
    public void addBall(){
        balls += 1;
    }
    public int getBalls(){
        return balls;
    }
}
