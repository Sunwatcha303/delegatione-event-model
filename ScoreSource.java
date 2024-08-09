import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private String scoreLine;
    private List<ScoreListener> list;

    public ScoreSource(){
        list = new ArrayList<>();
    }

    public void subscribe(ScoreListener l){
        list.add(l);
    }

    public void remove(ScoreListener l){
        list.remove(l);
    }

    public String getScoreLine(){
        return scoreLine;
    }

    public void setScoreLine(String scoreLine){
        this.scoreLine = scoreLine;
        fireLiveScore(new ScoreEvent(this, scoreLine));
    }

    public void fireLiveScore(ScoreEvent e){
        for(ScoreListener l : list){
            l.scoreChange(e);
        }
    }
}