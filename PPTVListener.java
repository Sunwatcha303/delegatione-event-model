public class PPTVListener implements ScoreListener{

    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("PPTV live score: " + e.getLiveScore());
    }
    
}
