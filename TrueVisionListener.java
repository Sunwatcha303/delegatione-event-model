public class TrueVisionListener implements ScoreListener {

    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("True Vision live score: " + e.getLiveScore());
    }
}
